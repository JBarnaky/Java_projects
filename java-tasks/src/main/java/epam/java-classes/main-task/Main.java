import java.util.Scanner;
import java.util.Random;

public class Main {

    public static String column(String str, int b) {
        StringBuilder strBuilder = new StringBuilder(str);
        for (int i = 0; i < b; i++) {
            if (strBuilder.length() < b) {
                strBuilder.append(" ");
            }
        }
        str = strBuilder.toString();
        return str;
    }

    public static void main(String[] args) {
        int action;
//        Patient[] pt = new Patient[14];
//        pt[0] = new Patient("Иванов", "Иван", "Иванович", "3я улица Строителей",
//                "ОРВИ", 2345678, 01234567, 1);

        String[] firstName_ = {"Семен", "Адам", "Валентин", "Лаврентий", "Евгений", "Григорий", "Панкрат", "Мартын", "Богдан", "Юлий",
                "Алексей", "Гарри", "Бронислав", "Киррил", "Устин"};
        String firstName;
        String[] lastName_ = {"Селиверстов", "Савин", "Кошелев", "Григорьев", "Веселов", "Доронин", "Романов", "Горбунов",
                "Морозов", "Зиновьев", "Артемьев", "Зуев", "Волков", "Наумов", "Маслов"};
        String lastName;
        String[] mName_ = {"Геннадьевич", "Игоревич", "Ильяович", "Лаврентьевич", "Олегович", "Федорович", "Юрьевич",
                "Куприянович", "Андреевич", "Еремеевич", "Егорович", "Евсеевич", "Васильевич", "Пантелеймонович", "Борисович"};
        String mName;
        String[] address_ = {"Первомайский Мкрн дом 64 кв 12", "60 Лет Октября Ул дом 145 кв 319",
                "Чертановская Ул дом 64 Корп 3 кв 118", "Волжская Ул дом 31 кв 54", "Московская Ул дом 91 кв 242",
                "Первомайская 4 Ул дом 14 кв 2", "Ушинского Ул дом 18 кв 94", "Свободы дом 23 кв 39",
                "Вольская Ул дом 13 кв 94", "Ленина Ул дом 15 кв 77", "Гнесиных Ул дом 62 кв 23",
                "Помяловского Ул дом 15 кв 31", "50 Лет Нлмк Ул дом 1А кв 9", "Растопчина Ул дом 39А кв 10",
                "17 Микрорайон дом 10 кв 25"};
        String address;
        int phone;
        String[] diagnosis_ = {"ОРВИ", "Грипп", "Гайморит", "Пневмония", "Корона", "Ветрянка", "Гипертрофия", "Корона", "ОРВИ",
                "Грипп", "ОРВИ", "Пневмония", "Дерматит", "Корона", "ОРВИ"};
        String diagnosis;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество пациентов: ");
        int n = scanner.nextInt();
        Patient[] patient = new Patient[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            lastName = lastName_[i];
            firstName = firstName_[i];
            mName = mName_[i];
            address = address_[i];
            diagnosis = diagnosis_[i];
//          diagnosis = diagnosis_[r.nextInt(diagnosis_.length)];
            phone = 2000000 + rand.nextInt(99999);
            patient[i] = new Patient(column(firstName, 12), column(lastName, 10), column(mName, 12),
                    column(address, 12), column(diagnosis, 10), phone, IdGenerator.generateUniqueId(), i);
        }
        for (int i = 0; i < n; i++) {
            patient[i].Show();
        }
        try {
            System.out.println("Выберите фильтр для поиска: ");
            System.out.println("1) Поиск по номеру карты ");
            System.out.println("2) Поиск по Диагнозу ");
            action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:
                    System.out.println("Укажите интервал номеров карт для поиска: ");
                    int from = scanner.nextInt();
                    int to = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        if ((patient[i].getCard() >= from) && (patient[i].getCard() <= to)) {
                            patient[i].Show();
                        }
                    }
                    break;
                case 2:
                    System.out.print("Введите диагноз для поиска: ");
                    String search = scanner.nextLine();
                    for (int j = 0; j < n; j++) {
                        String diag = patient[j].getDiagnosis();
                        if (diag.trim().equalsIgnoreCase(search.trim())) {
                            patient[j].Show();
                        }
                    }
                    break;
            }
        }
        catch (Exception e){
            System.out.print("Что-то пошло не так " + e);
        }
    }
}