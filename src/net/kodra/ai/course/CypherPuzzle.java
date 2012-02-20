package net.kodra.ai.course;

public class CypherPuzzle {

	static String cypher = "Esp qtcde nzyqpcpynp zy esp ezatn zq Lcetqtntlw Tyepwwtrpynp hld spwo le Olcexzfes Nzwwprp ty estd jplc.";
	static String table[] = {"ABCDEFGHIJKLMNOPQRSTUVWXYZ", "abcdefghijklmnopqrstuvwxyz"};

	public static void main(String args[]) {
		for (int i = 0; i < 26; i++) {
			System.out.println(i + ". " + translate(cypher, i));
		}
	}

	private static String translate(String cypher, int d) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < cypher.length(); i++) {
			final char c = cypher.charAt(i);
			if (c == ' ' || c == '.')
				result.append(c);
			final int index[] = {table[0].indexOf(c), table[1].indexOf(c)};
			if(index[0] >= 0) {
				result.append(table[0].charAt((index[0]+d) % 26));
			}
			if(index[1] >= 0) {
				result.append(table[1].charAt((index[1]+d) % 26));
			}
		}
		return result.toString();
	}

	static void task2() {
		String[] text = {"|de|  | f|Cl|nf|ed|au| i|ti|  |ma|ha|or|nn|ou| S|on|nd|on|",
						 "|ry|  |is|th|is| b|eo|as|  |  |f |wh| o|ic| t|, |  |he|h |",
						 "|ab|  |la|pr|od|ge|ob| m|an|  |s |is|el|ti|ng|il|d |ua|c |",
						 "|he|  |ea|of|ho| m| t|et|ha|  | t|od|ds|e |ki| c|t |ng|br|",
						 "|wo|m,|to|yo|hi|ve|u | t|ob|  |pr|d |s |us| s|ul|le|ol|e |",
						 "| t|ca| t|wi| M|d |th|\"A|ma|l |he| p|at|ap|it|he|ti|le|er|",
						 "|ry|d |un|Th|\" |io|eo|n,|is|  |bl|f |pu|Co|ic| o|he|at|mm|",
						 "|hi|  |  |in|  |  | t|  |  |  |  |ye|  |ar|  |s |  |  |. |"};
	}
	
	
	
}
