package com.javarush.task.task19.task1918;

/* Знакомство с тегами

Считайте с консоли имя файла, который имеет HTML-формат.

Пример:
Info about Leela <span xml:lang=»en» lang=»en»><b><span>Turanga Leela
</span></b></span><span>Super</span><span>girl</span>

Первым параметром в метод main приходит тег. Например, «span«.
Вывести на консоль все теги, которые соответствуют заданному тегу.
Каждый тег на новой строке, порядок должен соответствовать порядку следования в файле.
Количество пробелов, n, r не влияют на результат.
Файл не содержит тег CDATA, для всех открывающих тегов имеется отдельный закрывающий тег, одиночных тегов нет.
Тег может содержать вложенные теги.

Пример вывода:
<span xml:lang="en" lang="en"><b><span>Turanga Leela</span></b></span>
<span>Turanga Leela</span>
<span>Super</span>
<span>girl</span>

Шаблон тега:
<tag>text1</tag>
<tag text2>text1</tag>
<tag
text2>text1</tag>

text1, text2 могут быть пустыми


Требования:
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла (используй FileReader).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль все теги, которые соответствуют тегу, заданному в параметре метода main.
*/

public class Solution {
    public static void main(String[] args) {
    }
}
