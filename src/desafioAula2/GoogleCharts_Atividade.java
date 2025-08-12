package desafios;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class GoogleCharts_Atividade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Qual a quantidade de numeros que devem ser gerados em uma amostra aleatória: ");
        int quantidade_num = sc.nextInt();
        
        System.out.print("Quais os valores mínimos possiveis da amostra: ");
        int valor_minimo = sc.nextInt();
        
        System.out.print("Quais os valores maximos possiveis da amostra: ");
        int valor_maximo = sc.nextInt();
        
        Random rd = new Random();
        
        ArrayList<Integer> valores = new ArrayList<Integer>();
        
        for(int i = 0; i < quantidade_num; i++) {
        	valores.add(rd.nextInt(valor_maximo	 - valor_minimo + 1) + valor_minimo);
        }
        
        String grafico = "";
        
        for(int i = 0; i < quantidade_num; i++) {
        	if((i + 1 == quantidade_num) ) {
        		grafico += "["+ (i + 1) +","+  valores.get(i) + "]";
        	}else {
        		grafico += "["+ (i + 1) +","+  valores.get(i) + "],\r\n";
        	}
		}
        
        System.out.println(grafico);
        
        
        String caminhoArquivo = "grafico.html";
		String conteudo = 
				"<html>\r\n"
				+ "<head>\r\n"
				+ "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n"
				+ "    <script type=\"text/javascript\">\r\n"
				+ "        google.charts.load('current', {'packages':['corechart']});\r\n"
				+ "        google.charts.setOnLoadCallback(drawChart);\r\n"
				+ "\r\n"
				+ "        function drawChart() {\r\n"
				+ "          var data = google.visualization.arrayToDataTable([\r\n"
				+ "            ['Quantidade valores', 'Valores'],\r\n"
				+ "           " + grafico 
				+ "          ]);\r\n"
				+ "\r\n"
				+ "          var options = {\r\n"
				+ "            title: 'Company Performance',\r\n"
				+ "            curveType: 'function',\r\n"
				+ "            legend: { position: 'bottom' }\r\n"
				+ "          };\r\n"
				+ "\r\n"
				+ "          var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));\r\n"
				+ "\r\n"
				+ "          chart.draw(data, options);\r\n"
				+ "        }\r\n"
				+ "    </script>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<div id=\"curve_chart\" style=\"width: 900px; height: 500px\"></div>\r\n"
				+ "</body>\r\n"
				+ "</html>\r\n";
		try {
			FileWriter writer = new FileWriter(caminhoArquivo);
			writer.write(conteudo);
			writer.close();
			System.out.println("Arquivo criado com sucesso!");
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao criar o arquivo: "+e.getMessage());
		}
		
	}
	
	
}