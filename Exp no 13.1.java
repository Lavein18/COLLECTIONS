import java.util.*;

class GFG {

 static class Bills {

         int min, max;

         int total, sum;

Bills(int price)

        {

            min = price;

            max = price;

            total = 1;

            this.sum = price;

        }

    }

static void findPrices(int Bills[], int price[], int n)

    {

HashMap<String, Bills> map = new HashMap<>();

for (int i = 0; i < n; i++) {

if (map.containsKey(Bills[i])) {

Item currBills = map.get(Bills[i]);

                currBills.min = Math.min(currBills.min, price[i]);

                currBills.max = Math.max(currBills.max, price[i]);

currBills.total++;

                    currBills.sum += price[i];

            }

            else { 
               
                Bills currBills = new Bills(price[i]);

                map.put(Bills[i], currBills);

            }

        }

System.out.println("Bills Min Max Average");

        for (Map.Entry<Int, Bills> ob : map.entrySet()) {

            Int key = ob.getKey();

            Bills currBills = ob.getValue();

            System.out.println(key + " " + currBills.min

                               + " " + currBills.max + " "

                               + ((float)currBills.sum / (float)currBills.total));

        }

    }

public static void main(String args[])

    {       

        int Bills[] = { 200, 150, 300, 200, 200, 150, 300, 200, 150, 300, 200, 100 };
 

        findPrices(Bills, n);

    }
}
