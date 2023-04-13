// /*Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} */
public class homeWork1 {
    String string = "select * from students where ";
    public StringBuilder stringBuilder(String string){
        StringBuilder stringBuilder = new StringBuilder();
        String[] str = string.split(" ");
        for (int i = 0; i < str.length; i++) {
            stringBuilder.append(str[i]);
            System.out.println(str[i]);
            
        }

        return stringBuilder;
    }

}
