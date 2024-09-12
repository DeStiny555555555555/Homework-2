//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightOneBoxer = 78.2;
        System.out.println(weightOneBoxer);
        var weightTwoBoxer = 82.7;
        System.out.println(weightTwoBoxer);
        var boxerWeight = weightOneBoxer + weightTwoBoxer;
        System.out.println("Общий вес боксеров" + boxerWeight);
        var leftWeight  = weightTwoBoxer - weightOneBoxer;
        System.out.println("Разница в весе" + leftWeight + "кг!");

        var totalWeight = weightTwoBoxer % weightOneBoxer;
        System.out.println("Остаток веса" + totalWeight + "кг!");

        var WorkerTime = 640;
        System.out.println(WorkerTime);
        var TimeOneWorker = 8;
        System.out.println(TimeOneWorker);
        var AllWorker = WorkerTime / TimeOneWorker;
        System.out.println("Всего работников в компании" + AllWorker + "человек");
        var AllWorker2 = 94;
        System.out.println("Если в компании работает" + AllWorker2 + "человек,то всего" + (AllWorker2 * 8) + "часов работы может быть поделено между сотрудниками");
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}