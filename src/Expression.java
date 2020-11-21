import java.util.Map;

public interface Expression {

        public Integer evaluate(Map<String, Integer> map); //nimmt eine Map<String, Integer>, die Variablennamen Werte zuweist, und wertet den AST mit dieser Variablenbelegung zu einem Integer aus.
        public String toString();//serialisiert den AST als geklammerten Ausdruck. Dabei sollen Klammern nur genau dann ergänzt werden, wenn diese notwendig sind
        public Integer rank();//liefert den Rang des Elements im AST im Sinne der Präzedenz der Operatoren zurück. Werte und Variablen haben dabei einen Rang von 0, Multiplikation und Division einen Rang von 1 und Addition und Subtraktion einen Rang von 2

}
