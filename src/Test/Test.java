package Test;

public class Test {

  /*  ArrayList<String> list = new ArrayList<>();
        list.add("Молоко");
        list.add("Клубника");
        list.add("Яблоко");
        list.add("Ручка");
        list.add("Наушники");
        list.add("Мышка");
        list.add("Клавиатура");
        list.add("Колонки");
        list.add("Конфеты");
        list.add("Кола");
        list.add("Чипсы");
        list.add("Чай");
        list.add("Телефон");

    pageList(list);
}

public static void pageList(ArrayList<String> pageList) {
    int pageSize = 3;
    int totalPages = (int) Math.ceil((double)   pageList.size() / pageSize);
    for (int page = 1; page <= totalPages; page++) {
        int from = (page - 1) * pageSize;
        int to = Math.min(from + pageSize, pageList.size());
        List<String> pageItem = pageList.subList(from, to);
        System.out.println("Страница: " + page + " - " + pageItem);
    }
}
}
}
*/
    // String text = "3 4 % 2 + +";

//        System.out.println(evaluatePostfix(text));
//}
//
//public static int evaluatePostfix(String expression) {
//    if (expression == null || expression.isEmpty()) return 0;
//
//    Deque<Integer> stack = new ArrayDeque<>();
//    String[] tokens = expression.split(" ");
//
//    for (String token : tokens) {
//        if (token.matches("-?\\d+")) {
//            stack.push(Integer.parseInt(token));
//        } else {
//            int b = stack.pop();
//            int a = stack.pop();
//
//            switch (token) {
//
//                case "+": stack.push(a+b); break;
//                case "-": stack.push(a-b); break;
//                case "*": stack.push(a*b); break;
//                case "/":
//                    if (b == 0) throw new ArithmeticException("Деление на ноль");
//                    stack.push(a/b);
//                    break;
//                default:
//                    throw  new IllegalArgumentException("Неизвестный оператор: " + token);
//            }
//        }
//    }
//
//    return stack.pop();
//
//

}