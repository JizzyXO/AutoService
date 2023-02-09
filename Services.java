import java.util.Scanner;

public class Services {
    public void autoServices() {
        Scanner scanner = new Scanner(System.in);

        int moneyNum;
        int choiceNum;
        int changeNum;

        System.out.println("Добро пожаловать в автосервис!");
        System.out.println("Выберите услугу для обслуживания автомобиля: ");
        System.out.println("""
                1. Техническое обслуживание: 1500 рублей
                2. Диагностика автомобиля: 1000 рублей
                3. Ремонт подвески: 400 рублей
                4. Обслуживание тормозной системы: 750 рублей
                5. Ремонт двигателя автомобиля: 10000 рублей
                6. Шиномонтаж и хранение колёс: 2500 рублей
                7. Ремонт топливной системы: 3000 рублей
                8. Ремонт системы охлаждения: 2400 рублей
                9. Ремонт выхлопной системы: 1300 рублей
                10. Обслуживание и ремонт автомобиля: 30000 рублей""");
        System.out.println("Внесите денежные средства: ");
        moneyNum = scanner.nextInt();
        if (moneyNum > 900) {
            System.out.println("Вы внесли " + moneyNum + " рублей");
        } else {
            System.out.println("Вы внесли недостаточное количество средств для оказания услуг \n Приходите позже");
        }
        System.out.println("Выберите услугу, введя номер услуги: ");
        choiceNum = scanner.nextInt();

        switch (choiceNum) {
            case 1:
                changeNum = moneyNum - 1000;
                System.out.println("Выбрана услуга 'Диагностика автомобиля', ваша сдача: " + changeNum);
                break;
            case 2:
                changeNum = moneyNum - 1300;
                System.out.println("Выбрана услуга 'Ремонт выхлопной системы', ваша сдача: " + changeNum);
                break;
            case 3:
                changeNum = moneyNum - 400;
                System.out.println("Выбрана услуга 'Ремонт подвески', ваша сдача: " + changeNum);
                break;
            case 4:
                changeNum = moneyNum - 750;
                System.out.println("Выбрана услуга 'Обслуживание тормозной системы', ваша сдача: " + changeNum);
                break;
            case 5:
                changeNum = moneyNum - 10000;
                System.out.println("Выбрана услуга 'Ремонт двигателя автомобиля', ваша сдача: " + changeNum);
                break;
            case 6:
                changeNum = moneyNum - 2500;
                System.out.println("Выбрана услуга 'Шиномонтаж и хранение колёс', ваша сдача: " + changeNum);
                break;
            case 7:
                changeNum = moneyNum - 3000;
                System.out.println("Выбрана услуга 'Ремонт топливной системы', ваша сдача: " + changeNum);
                break;
            case 8:
                changeNum = moneyNum - 2400;
                System.out.println("Выбрана услуга 'Ремонт системы охлаждения', ваша сдача: " + changeNum);
                break;
            case 9:
                changeNum = moneyNum - 30000;
                System.out.println("Выбрана услуга 'Обслуживание и ремонт автомобиля', ваша сдача: " + changeNum);
                break;
        }
    }
}
