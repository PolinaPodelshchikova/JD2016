package by.it.telushko.jd01_06;
import by.it.telushko.jd01_02.InOut;
public class Main {
    public static void main(String[] args) {
        String text="У лукоморья дуб зелёный;\n" + "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный\n" + "Всё ходит по цепи кругом;\n"+
                "Идёт направо - песнь заводит,\n" + "Налево - сказку говорит.\n" +
                "Там чудеса: там леший бродит,\n" + "Русалка на ветвях сидит;\n" +
                "Там на неведомых дорожках\n" + "Следы невиданных зверей;\n" +
                "Избушка там на курьих ножках\n" + "Стоит без окон, без дверей;\n" +
                "Там лес и дол видений полны;\n" + "Там о заре прихлынут волны\n" +
                "На брег песчаный и пустой,\n" + "И тридцать витязей прекрасных\n" +
                "Чредой из вод выходят ясных,\n" + "И с ними дядька их морской;\n" +
                "Там королевич мимоходом\n" + "Пленяет грозного царя;\n" +
                "Там в облаках перед народом\n" + "Через леса, через моря\n" +
                "Колдун несёт богатыря;\n" + "В темнице там царевна тужит,\n" +
                "А бурый волк ей верно служит;\n" + "Там ступа с Бабою Ягой\n" +
                "Идёт, бредёт сама собой,\n" + "Там царь Кащей над златом чахнет;\n" +
                "Там русский дух... там Русью пахнет!\n" + "И там я был, и мёд я пил;\n" +
                "У моря видел дуб зелёный;\n" + "Под ним сидел, и кот учёный\n" +
                "Свои мне сказки говорил."
                ;
        String text2="Послание рассказывает историю нигерийского космонавта Абаче Тунде,\n" +
                " который стал первым африканцем в космосе... В 1989 году он отправился к секретной космической базе Салют.\n " +
                "Через год советские космонавты вылетели домой, однако место Абаче оказалось занято багажом.\n" +
                " С тех пор на протяжении многих лет он получал еду и припасы с кораблями «Прогресс».\n " +
                "Кузен космонавта уверяет: сейчас Абаче в хорошем настроении, но хочет домой!\n" +
                " Для этого родственник космонавта просит выслать три миллиона долларов, необходимые на возвращение?\n" +
                " После он обещает вернуть деньги из 25 миллионов долларов, которые накапали в качестве жалованья Абаче.\n ";

        System.out.println("Выберите тип задач(а, b, c)\n(можно раскомментировать нужную букву)");
        String taskNum=InOut.consoleLineInput(); //выбор типа задания
        //String taskNum="a";
        //String taskNum="b";
        //String taskNum="c";
        switch (taskNum){
            case "a":{
                System.out.println("Задача А-1");
                TaskA.taskA1(text);
                System.out.println("Задача А-2");
                TaskA.taskA2(text);
                System.out.println("Задача А-3");
                TaskA.taskA3(text);
                break;
            }
            case "b": {
                TaskB.taskB1(text);
                System.out.println("Задача В-2\nИсходный текст: \n"+text2);
                TaskB.taskB2(text2);
                System.out.println("Введите букву для задания В-3");
                char letter =InOut.consoleCharInput();
                    TaskB.TaskB3(text,letter);
                break;
            }

            case "c": {
                TaskC.taskC1(text);
                //TaskC.taskC2(text); не сделано
            break;
            }
            default :{
                System.out.println("Ошибка!");
                break;
            }
        }
    }
}
