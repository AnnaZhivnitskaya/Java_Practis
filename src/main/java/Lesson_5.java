public class Lesson_5 {
//    public static void main(String[] args){
//
////            System.out.println(isMatches("foo", "bar"));
////            System.out.println(isMatches("paper", "title"));
////            System.out.println(isMatches("egg", "add"));
////            System.out.println(isMatches("abcde", "bcdef"));
//        }
//
///**
// * Проверить, что 2 строки являются изоморфными в том смысле, что одну букву в первом слове можно заменить на какую-то во втором.
// * Изоморфные строки имеют одинаковую длину.
// * Примеры:
// * (foo, bar) -> false f -> b, o -> a
// * (paper, title) -> true p -> t, a -> i, e -> l, r -> e
// * (egg, add) -> true e -> a, g -> d
// * (abcde, bcdef) -> true a -> b, b -> c, c -> d, d -> e, e -> f
// */
//        static boolean isMatches(String s1, String s2) {
//            static boolean isCorrectParentheses(String parentheses) {
//                char[] chars = parentheses.toCharArray();
//                if (chars.length % 2 != 0) {
//                    return false;
//                }
//
//                Map<Character, Character> dict = Map.of(
//                        '(', ')',
//                        '[', ']',
//                        '<', '>',
//                        '{', '}'
//                );
//
//                Deque<Character> symbols = new ArrayDeque<>(); // queue FIFO
//                for (char c : chars) {
//                    if (dict.containsKey(c)) { // c - открывающаяся скобка
//                        symbols.add(c);  // сохраняем
//                    } else { // c - закрывающаяся
//                        if (symbols.isEmpty()) {
//                            return false;
//                        }
//
//                        Character lastSymbol = symbols.pollLast(); // открывающая
//                        if (!Objects.equals(dict.get(lastSymbol), c)) { // Закрывающаяся для lastSymbol не совпадает с с
//                            return false;
//                        }
//                    }
//                }
//
//                return symbols.isEmpty();
//            }
//        }
//    /**
//     * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
//     * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
//     *
//     * и
//     * ты
//     * Еще
//     * день друг Пора
//     * ..
//     *
//     */
//    static void collectStats(String text) {
//        // Map<Integer, List<String>> stats = new HashMap<>();
//    }
  }

