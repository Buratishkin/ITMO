package classes.characters;

import records.Boat;
import classes.items.Weapon;
import enums.Landscapes;
import enums.Moves;
import exceptions.OverloadedInventoryException;
import exceptions.WeaponNotWorkingException;
import interfaces.Observable;
import classes.items.Item;

import java.util.ArrayList;

public class MainCharacter extends Human implements Observable{
    public MainCharacter(String name) {
        super(name);
    }

    @Override
    public void observe(Item spyglass, Moves move) {
        System.out.printf("я явно различал в %s %s как они %s\n", spyglass.getSimpleWeight(), spyglass.toString(), move.toString());
    }

    private final double inventoryMaxWeight = 50.0;

    private ArrayList<Item> inventory = new ArrayList<Item>();

    public double getInventoryWeight(){
        double res = 0;
        for (Item item : inventory){
            res += item.getWeight();
        }
        return res;
    }

    public Item getItem(int ind){
        return inventory.get(ind);
    }

    public void move(){
        System.out.println("двигается гг");
    }

    public void move(Landscapes landscape, int situation) {
        if (situation == 0)
            System.out.printf("я пошёл к %s\n", landscape.toString());
        else if (situation == 1) {
            System.out.printf("и, не теряя времени, отправился к тому %s, откуда открыл первые признаки этих людей\n", landscape);
        }
    }

    public void arrive(Boat boat){
        System.out.printf("добравшись туда я взглянул в сторону моря и увидел другую лодку с %s направлявшиеся от острова к материку", boat.toString());
    }

    public void addItem(Item item) throws OverloadedInventoryException, WeaponNotWorkingException {
        boolean flag = true;
        if (item instanceof Weapon){
            flag = repairWeapon((Weapon) item);
        }
        if (getInventoryWeight() + item.getWeight() <= inventoryMaxWeight && flag){
            inventory.add(item);
        } else if(!flag){
            throw new WeaponNotWorkingException(((Weapon) item).toString() + " не работает");
        } else {
            throw new OverloadedInventoryException("Слишком тяжелый инвентарь. Максимально допустимый вес: "
                    + inventoryMaxWeight + ", текущий вес: "
                    + getInventoryWeight() + ", вес добавляемого предмета: "
                    + item.getWeight());
        }
    }

    public void equip(Item item) {
        try {
            addItem(item);
        } catch (OverloadedInventoryException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (WeaponNotWorkingException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public boolean repairWeapon(Weapon weapon){
        if (!weapon.getIsWork()) {
            System.out.printf("%s сломано, попробую починить", weapon.toString());
            weapon.repair();
            return weapon.getIsWork();
        } else {
            System.out.printf("%s не сломано, его можно убирать\n", weapon.toString());
            return true;
        }
    }
}
