package flush;

/**
 * Настроить логирование для проекта с дополнительным заданием.
 * Из пакета ex_002_insert_and_update создайте в цикле 200 объектов author и сохраните в БД. Значения полей могут быть любыми. Используйте метод flush для каждых 10 объектов.
 * Метод сommit выполняйте один раз в конце.
 */

public class Main {
    public static void main(String[] args) {
        AuthorHelper ah = new AuthorHelper();
        ah.add200Authors();
    }
}
