import java.util.Scanner;

public class ConversordeUnidades{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        while (true){
            System.out.println(" |-|CONVERSOR DE UNIDADES|-| ");
            System.out.println(" ");
            System.out.println("[0] Para sair do app");
            System.out.println("[1] Para converter Moedas");
            System.out.println("[2] Para converter Unidades de Velocidade");
            System.out.println("[3] Para converter Unidades métricas");
            System.out.println("[4] Para converter Unidades Térmicas");
            System.out.println(" ");
            System.out.print("Sua opção de escolha aqui ->:");
            int escolhamenu = leitor.nextInt();
            
            if (escolhamenu == 0){
                System.out.println("Estamos saindo do app...");
                System.out.println("Tenha um bom dia!!");
                break;
            } else if(escolhamenu == 1){
                while (true){
                    System.out.println("|CONVERSOR DE MOEDAS|");
                    System.out.println("[0] Para sair do conversor de moedas");
                    System.out.println("[1] Para converter de Real para Dólar");
                    System.out.println("[2] Para converter de Real para Euro");
                    System.out.println("[3] Para converter de Real para Ienes");
                    System.out.println("[4] Para converter de Dólar para Real");
                    System.out.println("[5] Para converter de Dólar para Euro");
                    System.out.println("[6] Para converter de Dólar para Ienes");
                    System.out.println("[7] Para converter de Euro para Real");
                    System.out.println("[8] Para converter de Euro para Dólar");
                    System.out.println("[9] Para converter de Euro para Ienes");
                    System.out.println("[10] Para converter de Ienes para Real");
                    System.out.println("[11] Para converter de Ienes para Euro");
                    System.out.println("[12] Para converter de Ienes para Dólar");
                    System.out.println(" ");
                    System.out.print("Sua opção de escolha aqui ->: ");
                    int escolhamoeda = leitor.nextInt();

                    if (escolhamoeda == 0){
                        System.out.println("Saindo do conversor de de Moedas...");
                        break;
                    } else if(escolhamoeda == 1){
                        System.out.println("CONVERTENDO DE REAL PARA DÓLAR");
                        System.out.println(" ");
                        System.out.print("Digite o valor em Real R$: ");
                        double real = leitor.nextDouble();

                        double conversor = 0.20;
                        double convertido = real * conversor;
                    
                        System.out.println("O valor de R$:" + real + " convertido em Dólar é $:" + convertido);
                        System.out.println(" ");

                    } else if(escolhamoeda == 2){
                        System.out.println("CONVERTENDO DE REAL PARA EURO");
                        System.out.println(" ");
                        System.out.print("Digite o valor em Real R$: ");
                        double real = leitor.nextDouble();

                        double conversor = 0.17;
                        double convertido = real * conversor;

                        System.out.println("O valor de R$:" + real + " convertido em Euro é EUR:" + convertido);
                        System.out.println(" ");

                    } else if(escolhamoeda == 3){
                        System.out.println("CONVERTENDO DE REAL PARA IENES");
                        System.out.println(" ");
                        System.out.print("Digite o valor em Real R$: ");
                        double real = leitor.nextDouble();

                        double conversor = 30.50;
                        double convertido = real * conversor;

                        System.out.println("O valor de R$:" + real + " convertido em ienes é JPY:" + convertido);
                        System.out.println(" ");

                    } else if(escolhamoeda == 4){
                        System.out.println("CONVERTENDO DE DÓLAR PARA REAL");
                        System.out.println(" ");
                        System.out.print("Digite o valor em Dólar U$:");
                        double dolar = leitor.nextDouble();

                        double conversor = 5.12;
                        double convertido = dolar * conversor;

                        System.out.println("O valor de dólar $:" + dolar + " convertido em Real é R$:" + convertido);
                        System.out.println(" ");

                    } else if(escolhamoeda == 5){
                        System.out.println("CONVERTENDO DE DÓLAR PARA EURO");
                        System.out.println(" ");
                        System.out.print("Digite o valor em Dólar U$:");
                        double dolar = leitor.nextDouble();

                        double conversor = 0.86;
                        double convertido = dolar * conversor;

                        System.out.println("O valor de dólar $:" +  dolar + " convertido em Euro é EUR:" +convertido);
                        System.out.println(" ");

                    } else if(escolhamoeda == 6){
                        System.out.println("CONVERTENDO DE DÓLAR PARA IENES");
                        System.out.println(" ");
                        System.out.print("Digite o valor em Dólar U$:");
                        double dolar = leitor.nextDouble();

                        double conversor = 156;
                        double convertido = dolar * conversor;

                        System.out.println("O valor de dólar $:" + dolar + " convertido em IENES é JPY:" + convertido);
                        System.out.println(" ");

                    } else if(escolhamoeda == 7){
                        System.out.println("CONVERTENDO DE EURO PARA REAL");
                        System.out.println(" ");
                        System.out.print("Digite o valor em Euro EUR:");
                        double euro = leitor.nextDouble();

                        double conversor = 5.92;
                        double convertido = euro * conversor;

                        System.out.println("O valor de euro EUR:" + euro + " convertido em Real é R$" + convertido);
                        System.out.println(" ");

                    } else if(escolhamoeda == 8){
                        System.out.println("CONVERTENDO DE EURO PARA DÓLAR");
                        System.out.println(" ");
                        System.out.print("Digite o valor em Euro EUR:");
                        double euro = leitor.nextDouble();

                        double conversor = 1.16;
                        double convertido = euro * conversor;

                        System.out.println("O valor de euro EUR:" + euro + " convertido em Dólar é U$:" + convertido);
                        System.out.println(" ");

                    } else if(escolhamoeda == 9){
                        System.out.println("CONVERTENDO DE EURO PARA IENES");
                        System.out.println(" ");
                        System.out.print("Digite o valor em Euro EUR:");
                        double euro = leitor.nextDouble();

                        double conversor = 180.50;
                        double convertido = euro * conversor;

                        System.out.println("O valor de euro EUR:" + euro + "  convertido em IENES é JPY:" + convertido);
                        System.out.println(" ");

                    } else if(escolhamoeda == 10){
                        System.out.println("CONVERTENDO DE IENES PARA REAL");
                        System.out.println(" ");
                        System.out.print("Digite o valor em Ienes JPY:");
                        double ienes = leitor.nextDouble();

                        double conversor = 0.033;
                        double convertido = ienes * conversor;

                        System.out.println("O valor de Ienes JPY:" + ienes + " convertido em Real é R$:" + convertido);
                        System.out.println(" ");

                    } else if(escolhamoeda == 11){
                        System.out.println("CONVERTENDO DE IENES PARA DÓLAR");
                        System.out.println(" ");
                        System.out.print("Digite o valor em Ienes JPY:");
                        double ienes = leitor.nextDouble();

                        double conversor = 0.0064;
                        double convertido = ienes * conversor;

                        System.out.println("O valor de Ienes JPY:" + ienes + " convertido em Dólar é U$:" + convertido);
                        System.out.println(" ");

                    } else if(escolhamoeda == 12){
                        System.out.println("CONVERTENDO DE IENES PARA EURO");
                        System.out.println(" ");
                        System.out.print("Digite o valor em Ienes JPY:");
                        double ienes = leitor.nextDouble();

                        double conversor = 0.0055;
                        double convertido = ienes * conversor;

                        System.out.println("O valor de Ienes JPY:" + ienes + " convertido em Euro 'EUR:" + convertido);
                        System.out.println(" ");

                    } else{
                        System.out.println("Digite uma opção válida do menu de opções");
                    }
                }
            } else if(escolhamenu == 2){
                while (true){
                    System.out.println("CONVERSOR DE UNIDADES DE VELOCIDADE");
                    System.out.println(" ");
                    System.out.println("[0] Para sair do conversor");
                    System.out.println("[1] Para converter de KM/H para MPH");
                    System.out.println("[2] Para converter de MPH para KM/H");
                    System.out.print("Sua opção de escolha aqui ->:");
                    double escolhavelo = leitor.nextDouble();

                    if (escolhavelo == 0){
                        System.out.println("Saindo do convesor...");
                        break;
                    } else if (escolhavelo == 1){
                        System.out.println("CONVERTENDO DE KM/H PARA MPH");
                        System.out.println(" ");
                        System.out.print("Digite a velocidade em KM/H:");
                        double kmh = leitor.nextDouble();

                        double conversor = 0.62137;
                        double kmhconvertido = kmh * conversor;

                        System.out.println("A velocidade de " + kmh + "KM/H convertido em MPH é MPH:" + kmhconvertido);

                    } else if(escolhavelo == 2){
                        System.out.println("CONVERTENDO DE MPH PARA KM/H");
                        System.out.println(" ");
                        System.out.print("Digite a sua velocidade em MPH:");
                        double mph = leitor.nextDouble();

                        double conversor = 1.60934;
                        double convertido = mph * conversor;

                        System.out.println("A velocidade de " + mph + "MPH convertido em KM/H é KM/H:" + convertido);

                    } else {
                        System.out.println("Digite uma opção válida!");
                    }
                }

            } else if(escolhamenu == 3){
                while (true){
                    System.out.println("CONVERTENDO UNIDADES MÉTRICAS");
                    System.out.println(" ");
                    System.out.println("[0]");
                    System.out.println("[1] De MM para KM");
                    System.out.println("[2] De KM para MM");
                    System.out.println("[3] De MM para M");
                    System.out.println("[4] De M para MM");
                    System.out.println("[5] De MM para CM");
                    System.out.println("[6] De CM para MM");
                    System.out.println("[7] De CM para KM");
                    System.out.println("[8] De KM para CM");
                    System.out.println("[9] De CM para M");
                    System.out.println("[10] De M para CM");
                    System.out.println("[11] De M para KM");
                    System.out.println("[12] De KM para M");
                    System.out.println(" ");
                    System.out.print("Sua opção aqui ->: ");
                    int escolhametrica = leitor.nextInt();

                    if (escolhametrica == 0){
                        System.out.println("Saindo do conversor de Unidades métricas...");
                        System.out.println("Tenha um bom dia!");
                        break;
                    } else if (escolhametrica == 1){
                        System.out.println("CONVERTENDO DE MM PARA KM");
                        System.out.println(" ");
                        System.out.print("Digite a medida em mm:");
                        double mm = leitor.nextDouble();

                        double conversor = 0.000001;
                        double km = mm * conversor;

                        System.out.println("A medida de " + mm + "mm convertida em KM é KM:" + km);
                        System.out.println(" ");

                    } else if (escolhametrica == 2){
                        System.out.println("CONVERTENDO DE KM PARA MM");
                        System.out.println(" ");
                        System.out.print("Digite a medida em KM:");
                        double km = leitor.nextDouble();

                        double conversor = 1000000.0;
                        double mm = km * conversor;

                        System.out.println("A medida de " + km + "km convertida em MM é MM:" + mm);
                        System.out.println(" ");

                    } else if (escolhametrica == 3){
                        System.out.println("CONVERTENDO DE MM PARA M");
                        System.out.println(" ");
                        System.out.print("Digite a medida em M:");
                        double mm = leitor.nextDouble();

                        double conversor = 0.001;
                        double m = mm * conversor;

                        System.out.println("A medida " + mm + "mm convertida em M é M:" + m);
                        System.out.println(" ");

                    } else if (escolhametrica == 4){
                        System.out.println("CONVERTENDO DE M PARA MM");
                        System.out.println(" ");
                        System.out.print("Digite a medida em M:");
                        double m = leitor.nextDouble();

                        double conversor = 1000.0;
                        double mm = m * conversor;

                        System.out.println("A medida " + m + "M convertida em MM é MM:" + mm );
                        System.out.println(" ");

                    } else if (escolhametrica == 5){
                        System.out.println("CONVERTENDO DE MM PARA CM");
                        System.out.println(" ");
                        System.out.print("Digite a medida em MM:");
                        double mm = leitor.nextDouble();

                        double conversor = 0.1;
                        double cm = mm * conversor;

                        System.out.println("A medida " + mm + "mm convertida em CM é CM:" + cm);
                        System.out.println(" ");

                    } else if (escolhametrica == 6){
                        System.out.println("CONVERTENDO DE CM PARA MM");
                        System.out.println(" ");
                        System.out.print("Digite a medida em CM:");
                        double cm = leitor.nextDouble();

                        double conversor = 10.0;
                        double mm = cm * conversor;

                        System.out.println("A medida " + cm + "cm convertida em MM é MM: " + mm);
                        System.out.println(" ");

                    } else if (escolhametrica == 7){
                        System.out.println("CONVERTENDO DE CM PARA KM");
                        System.out.println(" ");
                        System.out.print("Digite a medida em cm:");
                        double cm = leitor.nextDouble();

                        double conversor = 0.00001;
                        double km = cm * conversor;

                        System.out.println("A medida " + cm + "cm convertida em KM é KM:" + km);
                        System.out.println(" ");

                    } else if (escolhametrica == 8){
                        System.out.println("CONVERTENDO DE KM PARA CM");
                        System.out.println(" ");
                        System.out.print("Digite a medida em KM:");
                        double km = leitor.nextDouble();

                        double conversor = 100000.0;
                        double cm = km * conversor;

                        System.out.println("A medida em " + km + "km convertida em CM é CM:" + cm);
                        System.out.println(" ");

                    } else if (escolhametrica == 9){
                        System.out.println("CONVERTENDO DE CM PARA M");
                        System.out.println(" ");           
                        System.out.print("Digite a medida em CM:");
                        double cm = leitor.nextDouble();
                        
                        double conversor = 0.01;
                        double m = cm * conversor;

                        System.out.println("A medida " + cm + "cm convertida em M é M:" + m);
                        System.out.println(" ");

                    } else if (escolhametrica == 10){
                        System.out.println("CONVERTENDO DE M PARA CM");
                        System.out.println(" ");
                        System.out.print("Digite a medida em M:");
                        double m = leitor.nextDouble();

                        double conversor = 100.0;
                        double cm = m * conversor;

                        System.out.println("A medida " + m + "m convertida em CM é CM:" + cm);
                        System.out.println(" ");

                    } else if (escolhametrica == 11){
                        System.out.println("CONVERTENDO DE M PARA KM");
                        System.out.println(" ");
                        System.out.print("Digite a medida em M:");
                        double m = leitor.nextDouble();

                        double conversor = 0.001;
                        double km = m * conversor;

                        System.out.println("A medida " + m + "m convertida em KM é KM:" + km);
                        System.out.println(" ");

                    } else if (escolhametrica == 12){
                        System.out.println("CONVERTENDO DE KM PARA M");
                        System.out.println(" ");
                        System.out.print("Digite a medida em KM:");
                        double km = leitor.nextDouble();

                        double conversor = 1000.0;
                        double m = km * conversor;

                        System.out.println("A medida " + km + "km convertida em M é M:" + m);
                        System.out.println(" ");

                    } else {
                        System.out.println("Digite uma opção válida no menu:");
                    }
                }
            } else if(escolhamenu == 4){
                while (true){
                    System.out.println("---|CONVERSOR DE UNIDADES DE TÉRMICAS|---");
                    System.out.println("[0] Para sair do conversor de unidades térmicas");
                    System.out.println("[1] Para converter de °C Para °F");
                    System.out.println("[2] Para converter de °F Para °C");
                    System.out.println("[3] Para converter de °C Para K");
                    System.out.println("[4] Para converter de K Para °C");
                    System.out.println("[5] Para converter de °F Para K");
                    System.out.println("[6] Para converter de K Para °F");
                    System.out.print("Sua opção aqui ->:");
                    int escolhatermica = leitor.nextInt();
                    System.out.println(" ");
                    if (escolhatermica == 0){
                        System.out.println("Saindo do conversor de unidades térmicas...");
                        break;

                    } else if (escolhatermica == 1){
                        System.out.println("CONVERTENDO DE °C PARA °F");
                        System.out.println(" ");
                        System.out.print("Digite a temperatura em °C:");
                        double c = leitor.nextDouble();

                        double f = (c * 1.8) + 32;
                        
                        System.out.println("A temperatura " + c + "°C convertida em °F é °F" + f);
                        System.out.println(" ");

                    } else if (escolhatermica == 2){
                        System.out.println("CONVERTENDO DE °F PARA °C");
                        System.out.println(" ");
                        System.out.print("Digite a temperatura em °F:");
                        double f = leitor.nextDouble();

                        double c = (f - 32) / 1.8;

                        System.out.println("A temperatura " + f + "°F convertido em °C é °C:" + c);
                        System.out.println(" ");

                    } else if (escolhatermica == 3){
                        System.out.println("CONVERTENDO DE °C PARA K");
                        System.out.println(" ");
                        System.out.print("Digite a temperatura em °C:");
                        double c = leitor.nextDouble();

                        double k = c + 273.15;

                        System.out.println("A temperatura " + c  + "°C convertida em K é K:" + k);
                        System.out.println(" ");

                    } else if (escolhatermica == 4){
                        System.out.println("CONVERTENDO DE K PARA °C");
                        System.out.println(" ");
                        System.out.print("Digite a temperatura em K:");
                        double k = leitor.nextDouble();

                        double c = k - 273.15;

                        System.out.println("A temperatura" + k + "k convertida em °C é °C" + c);
                        System.out.println(" ");

                    } else if (escolhatermica == 5){
                        System.out.println("CONVERTENDO DE °F PARA K");
                        System.out.println(" ");
                        System.out.print("Digite a temperatura em °F:");
                        double f = leitor.nextDouble();

                        double k = ((f -32) / 1.8 ) + 273.15;

                        System.out.println("A temperatura " + f + "°F convertida em K é K:" + k);
                        System.out.println(" ");

                    } else if (escolhatermica == 6){
                        System.out.println("CONVERTENDO DE K PARA °F");
                        System.out.println(" ");
                        System.out.print("Digite a temperatura em K:");
                        double k = leitor.nextDouble();

                        double f = ((k - 273.15) * 1.8) + 32;

                        System.out.println("A temperatura " + k + "K convertida em °F é °F:" + f);
                        System.out.println(" ");

                    } else {
                        System.out.println("Digite uma opção válida");
               }
            }
        } else {
            System.out.println("Digite uma opção válida no menu de opção!!!");
        }
    
    }
    leitor.close();
    }
    
}