Använd den här filen för att skriva din code review.

Du kommer att få möjlighet att presentera den även direkt till oss.


rad 11 "data = (Object[]) new Object[1000];"
En arraylist eller dylikt hade fungerat bättre då man slipper sätta en gräns på 1000 objekt.


rad 17 "* @param item An item to put on the stack."
Det finns ingen parameter i den funktionen som heter item, newItem finns däremot.


rad 31-32 "stackPointer--;
           return data[stackPointer];"
           
Det kollas inte ifall stackPointer är 0, samt att objektet inte tas bort ur stacken.
           
           
rad 41-46 "public boolean contains(Object item){

        Object o = Arrays.stream(data).filter(x -> item.equals(x)).findFirst();

        return o != null;
    }"
Denna funktionen är väldigt svår att läsa och förstå, en for loop hade varit lättare att läsa.
Varför hoppas det över en rad mellan textraderna i denna funktionen men inte i de andra? Försök hålla koden konsistent. 
   
           
rad 49 "* Get the item of the stack. Will pop until it finds it of throw an IllegalArgumentException if not found."
"until it finds it" är rätt vagt, specificera vad it syftar på. Det står även of istället för or precis efteråt.
