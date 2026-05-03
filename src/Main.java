void main() {
    // Задача 1
    var dog = 8.0;
    var cat = 3.6;
    var paper = 763789;

    System.out.println("Задание 1:");
    System.out.println("Dog = " + dog + ", Cat = " + cat + ", Paper = " + paper);


    // Задача 2
    dog += 4;
    cat += 4;
    paper += 4;

    System.out.println("Задание 2:");
    System.out.println("Dog + 4 = " + dog + ", Cat + 4 = " + cat + ", Paper + 4 = " + paper);


    // Задача 3
    dog -= 3.5;
    cat -= 1.6;
    paper -= 7639;

    System.out.println("Задание 3:");
    System.out.println("Dog - 3.5 = " + dog + ", Cat - 1.6 = " + cat + ", Paper - 7639 = " + paper);


    // Задача 4
    System.out.println("Задание 4:");

    var friend = 19;
    System.out.println("Начальное число: " + friend);

    friend += 2;
    System.out.println("friend + 2 = " + friend);

    friend /= 7;
    System.out.println("friend / 7 = " + friend);


    // Задача 5
    System.out.println("Задание 5:");

    var frog = 19;
    System.out.println("Начальное число: " + frog);

    frog *= 10;
    System.out.println("frog * 10 = " + frog);

    frog /= 3.5;
    System.out.println("frog / 3.5 = " + frog);

    frog += 4;
    System.out.println("frog + 4 = " + frog);


    // Задача 6
    System.out.println("Задание 6:");

    var boxer1Weight = 78.2;
    var boxer2Weight = 82.7;
    var totalWeight = boxer1Weight + boxer2Weight;
    System.out.println("Общая масса двух бойцов: " + totalWeight);

    var diffWeight = boxer2Weight - boxer1Weight;
    System.out.println("Разница в массе бойцов: " + diffWeight);

    // Задача 7
    System.out.println("Задание 7:");

    var massLeft = boxer2Weight % boxer1Weight;
    System.out.println("Остаток от деления массы бойцов: " + massLeft);

    // Задача 8
    System.out.println("Задание 8:");

    var totalTime = 640;
    var timeOneEmployee = 8;
    var countEmployee = totalTime / timeOneEmployee;

    System.out.println("Всего работников в компании - " + countEmployee + " человек");

    var extraEmployee = 94;
    var newCountEmployee = countEmployee + 94;
    var newTotalTime = newCountEmployee * timeOneEmployee;

    System.out.println("Если в компании работает на " + extraEmployee
            + " человека больше, то всего " + newTotalTime
            + " часов работы может быть поделено между сотрудниками");
}
