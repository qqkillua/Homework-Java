import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

void main() {
//    // Задание 1
//    System.out.println("Имя: Никита; Возраст: 19 лет; Город: Караганда");
//
//    // Задание 2
//    int age = 19;
//    double PI = 3.14;
//    boolean truth = true;
//    String name = "Nikita";
//    char letter = 'A';
//
//    // Задание 3
//
//    for (int i = 1; i < 11; i++) {
//        System.out.println("7 * " + i + " " + "=" + " " + + 7 * i);
//    }
//
//    System.out.println();
//
//    // Задание 4
//    int size = 5;
//    for (int row = 0; row < size; row++) {
//        for (int col = 0; col < 13; col++) {
//            boolean u1 = (col == 0 && row < 4) || (col == 2 && row < 4) || (row == 4 && col == 1);
//
//            boolean w = (col == 4 && row < 4) || (col == 8 && row < 4) || (row == 4 && (col == 5 || col == 7)) || (row == 3 && col == 11);
//
//            boolean u2 = (col == 10 && row < 4) || (col == 12 && row < 4) || (row == 4 && col == 11);
//
//            if (u1 || w || u2) {
//                System.out.print("*");
//            } else {
//                System.out.print(" ");
//            }
//        }
//        System.out.println();
//    }

    // Массивы

    // Задание 1
//    ArrayList<String> cities = new ArrayList<>(List.of("Karaganda", "Moscow", "Vena", "Abay", "Astana", "Almaty"));
//    System.out.println(cities);
//    cities.remove(0);
//    cities.add("Chikago");
//    cities.add("Paris");
//    System.out.println(cities.get(0));
//    System.out.println(cities);
//    System.out.println(cities.size());
//
//    // Задание 2
//    List<Integer> numbers = new ArrayList<>(List.of(3, 5, 3, 8, 5, 1, 8));
//    LinkedHashSet<Integer> nums = new LinkedHashSet<>(numbers);
//    System.out.println(nums);
//
//    // Задание 3
//    HashSet<String> courseA = new HashSet<>(Set.of("Алексей", "Мария", "Иван", "София", "Дмитрий", "Александр"));
//    HashSet<String> courseB = new HashSet<>(Set.of("Максим", "Елена", "Павел", "Кирилл", "Ольга", "Иван"));
//
//    HashSet<String> crossing = new HashSet<>(courseA);
//    crossing.retainAll(courseB);
//    System.out.println("Пересечение - " + crossing);
//
//    HashSet<String> union = new HashSet<>(courseA);
//    union.addAll(courseB);
//    System.out.println("Объедиение - " + union);
//
//    HashSet<String> difference = new HashSet<>(courseA);
//    difference.removeAll(courseB);
//    System.out.println("Разность - " + difference);
//
//    // Задание 4
//    TreeSet<Integer> randomNums = new TreeSet<>(Set.of(14, 87, 3, 42, 99, 12, 65, 28, 51, 7));
//    System.out.println("Первый элемент - " + randomNums.first() + "\nПоследний элемент - " + randomNums.last());
//    System.out.println("Числа меньше 50 - " + randomNums.headSet(50));
//    System.out.println("Числа от 20 до 80 - " + randomNums.subSet(20, 80));
//
//    // Задание 5
//    String str = "Java — это мощный и популярный язык программирования. Java используется везде, а программирование на Java приносит удовольствие!";
//    String[] words = str.toLowerCase()
//                        .replace("[^a-zа-я0-9\\s]", "")
//                        .split("\\s+");
//
//    Map<String, Integer> wordsCount = new HashMap<>();
//    for (String word : words) {
//        wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
//    }
//
//    List<Map.Entry<String, Integer>> list = new ArrayList<>(wordsCount.entrySet());
//    list.sort(Map.Entry.comparingByValue());
//
//    Collections.reverse(list);
//
//    for (Map.Entry<String, Integer> entry : list) {
//        System.out.println(entry.getKey() + " - " + entry.getValue());
//    }

    // Задание 6
//    List<Student> students = new ArrayList<>();
//    students.add(new Student("Аня", "Алматы"));
//    students.add(new Student("Боря", "Караганда"));
//    students.add(new Student("Дима", "Караганда"));
//    students.add(new Student("Вика", "Алматы"));
//
//    Map<String, List<Student>> studentsByCity = new HashMap<>();
//
//    for (Student s : students) {
//        studentsByCity.computeIfAbsent(s.getCity(), k -> new ArrayList<>()).add(s);
//    }
//
//    System.out.println(studentsByCity);

    // Задание 7
//    List<Student> students = new ArrayList<>();
//    students.add(new Student("Максим", 20));
//    students.add(new Student("Даша", 19));
//    students.add(new Student("Никита", 20));
//    students.add(new Student("Дима", 18));
//    students.add(new Student("Инсар", 19));
//    students.add(new Student("Влад", 18));
//
//    students.sort(Comparator.comparingInt(Student::getAge).thenComparing(Student::getName));
//    System.out.println(students);

    // Здаание 8
//    int lenght = 15;
//    int[] nums = new int[lenght];
//    Random random = new Random();
//
//    for (int i = 0; i < nums.length; i++) {
//        nums[i] = random.nextInt(100) + 1;
//    }
//
//    List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
//    // Список без изменений
//    System.out.println("Список без изменений" + list);
//
//    // Сортировка
//    Collections.sort(list);
//    System.out.println("Отсортированный список" + list);
//
//    // Поиск числа 42
//    int index = Collections.binarySearch(list, 42);
//    if (index >= 0) {
//        System.out.println("Число 42 найдено на индексе " + index);
//    } else {
//        System.out.println("Числа 42 нет в массиве");
//    }
//
//    // Максимум и минимум
//    System.out.println("Максимальное число: " + Collections.max(list));
//    System.out.println("Минимальное число " + Collections.min(list));
//
//    // Сумма
//    int sum = 0;
//
//    for (int num : list) {
//        sum += num;
//    }
//
//    System.out.println("Сумма: " + sum);

    // Задание 1 по REST API GET
//    HttpClient client = HttpClient.newHttpClient();
//
//    HttpRequest request = HttpRequest.newBuilder()
//            .uri(URI.create("https://jsonplaceholder.typicode.com/users/1"))
//            .GET()
//            .build();
//
//    try {
//        HttpResponse<String> response = client.send(
//                request,
//                HttpResponse.BodyHandlers.ofString()
//        );
//
//        System.out.println("Status Code: " + response.statusCode());
//        System.out.println("Response Body:\n" + response.body());
//    } catch (Exception e) {
//        e.printStackTrace();
//    }

    // Задание 2 REST API POST

//    HttpClient client = HttpClient.newHttpClient();
//
//    String jsonBody = """
//            {
//                "title": "Новый пост",
//                "body": "Содержимое поста",
//                "userId": "1"
//            }
//            """;
//
//    HttpRequest request = HttpRequest.newBuilder()
//            .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
//            .header("Content-Type", "application/json")
//            .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
//            .build();
//
//    try {
//        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
//
//        System.out.println("Status Code: " + response.statusCode());
//        System.out.println("Response Body:\n" + response.body());
//    } catch (Exception e) {
//        e.printStackTrace();
//    }

    // Задание 3 оббббработка статусов

    HttpClient client = HttpClient.newHttpClient();

    String[] urls = {
            "https://jsonplaceholder.typicode.com/posts/1",
            "https://jsonplaceholder.typicode.com/posts/999999"
    };

    for (String url : urls) {
        System.out.println("Запрос к: " + url);
        sendAndHandleRequest(client, url);
        System.out.println();
    }

}

private static void sendAndHandleRequest(HttpClient client, String url) {
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .GET()
            .build();
    try {
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        int statusCode = response.statusCode();

        switch (statusCode) {
            case 200 -> {
                System.out.println(" Успешно (200 OK)!");
                System.out.println("Тело ответа: " + response.body());
            }
            case 404 -> {
                System.out.println("Ошибка (404 Not Found): запрашиваемый ресурс не найден!");
            }
            case 500 -> {
                System.out.println("Ошибка сервера (500 Internal Server Error). Попробуйте позже.");
            }
            default -> {
                System.out.println("Получен другой статус-код: " + statusCode);
            }
        }
    } catch (Exception e) {
        System.err.println("Произошла ошибка при отправке сетевого запроса: " + e.getMessage());
    }
}

//public class Student {
//    private String name;
//    private  String city;
//
//    public Student(String name, String city) {
//        this.name = name;
//        this.city = city;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{name='" + name +  "', city='" + city + "'}";
//    }
//}


//public class Student {
//
//    private String name;
//    private Integer age;
//
//    public Student(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{name='" + name + "', age='" + age + "'}";
//    }
//}
