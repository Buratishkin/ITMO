package LabTwo;

import ru.ifmo.se.pokemon.*;


class HoopaConfined extends Pokemon {
    HoopaConfined(String name, int lvl) {
        super(name, lvl);
        setMove(new Swagger(), new DreamEater(), new Psychic(), new Facade());
        setStats(80, 110, 60, 150, 130, 70);
        setType(Type.PSYCHIC, Type.GHOST);
    }
}


class Blitze extends Pokemon {
    Blitze(String name, int lvl) {
        super(name, lvl);
        setMove(new DoubleTeam(), new Swagger(), new TailWhip());
        setStats(45, 60, 32, 50, 32, 76);
        setType(Type.ELECTRIC);
    }
}


class Zebstrika extends Blitze {
    Zebstrika(String name, int lvl) {
        super(name, lvl);
        setMove(new DoubleTeam(), new Swagger(), new TailWhip(), new Overheat());
        setStats(75, 100, 63, 80, 63, 116);
        setType(Type.ELECTRIC);
    }
}


class Sewaddle extends Pokemon {
    Sewaddle(String name, int lvl) {
        super(name, lvl);
        setMove(new Swagger(), new CalmMind());
        setStats(45, 53, 70, 40, 60, 42);
        setType(Type.BUG, Type.GRASS);
    }
}


class Swadloon extends Sewaddle {
    Swadloon(String name, int lvl) {
        super(name, lvl);
        setMove(new Swagger(), new CalmMind(), new GrassWhistle());
        setStats(55, 63, 90, 50, 80, 42);
        setType(Type.BUG, Type.GRASS);
    }
}


class Leavanny extends Swadloon {
    Leavanny(String name, int lvl) {
        super(name, lvl);
        setMove(new Swagger(), new CalmMind(), new GrassWhistle(), new Slash());
        setStats(75, 103, 80, 70, 80, 92);
        setType(Type.BUG, Type.GRASS);
    }
}
