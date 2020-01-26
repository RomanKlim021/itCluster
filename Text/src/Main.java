import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // datei lesen
        // wrap a BufferedReader around FileReader
        int sentenceCount = 0;
        int wordCount = 0;
        int dataCount = 0;
        String terminalSymbol = ".?!";
        String word = "a-zA-z";
        String data = "0-9{4}";
        String line = "History of Ukraine. Information on the earliest history of Ukraine is derived from archeological records and from general descriptions of the early Slavs by Greek, Roman, and Arab historians. Ukrainian national historiography has traditionally divided Ukrainian history into the following periods: (1) the so-called Princely era of Kyivan Rus’ and the Principality of Galicia-Volhynia; (2) the period of the Lithuanian-Ruthenian state; (3) the period of the Cossacks and the Hetman state; (4) the national and cultural revival of the 19th century; (5) the Ukrainian nation-state of 1917–21 [see Struggle for Independence (1917–20)]; (6) the interwar occupation of Ukrainian territories by four foreign powers; (7) the consolidation of most Ukrainian ethnic territory into the Ukrainian Soviet Socialist Republic; and finally, after 1991, (8) independent Ukraine. Because more than one political state often ruled Ukraine's territories simultaneously and, at times, several Ukrainian governments coexisted (eg, those of the Hetman state and of Right-Bank Ukraine), dealing with Ukraine's history presents many difficulties. Furthermore Western Ukraine experienced a historical development separate from that of central and eastern Ukraine, resulting in the evolution of the historical-political entities of Galicia, Volhynia, Bukovyna, and Transcarpathia. The only denominator unifying all of Ukraine's lands and state formations has been the Ukrainian people and its linguistic, social, cultural, and religious specificities.\n" +
                "\n" +
                "The Stone Age. The oldest traces of human existence in Ukraine, dating from the early Paleolithic Period (ca 300,000 BC) of the Stone Age, were discovered near the village of Luka-Vrublivetska on the Dnister River in 1946. Archeological evidence indicates that by the Upper Paleolithic Period (40,000–15,000 BC) almost all of Ukraine was inhabited by clans of hunters and gatherers. During the Mesolithic Period (10,000–7,000 BC) Ukraine's inhabitants engaged in fishing, had domesticated dogs, and used the bow and arrow; the first tribal units then appeared. During the Neolithic Period (7,000–3,000 BC) primitive agriculture and animal husbandry arose, as did pottery and weaving. These activities developed further during the Copper Age and Bronze Age.\n" +
                "\n" +
                "The Copper Age and Bronze Age. The Trypilian culture (first discovered in 1896), which existed from 4,000 to 2,000 BC in the Dnipro River and Dnister River basins of Right-Bank Ukraine, was the most advanced culture during this period on the territory of Ukraine. Many other synchronous cultures evolved from the late 4th to the early 1st millennium BC. Left-Bank steppe and forest-steppe were inhabited by the agricultural-pastoral tribes of the Pit-Grave culture, Catacomb culture, Serednii Stih culture, Marianivka culture, Timber-Grave culture, and Bondarykha culture. Right-Bank Polissia and parts of the forest-steppe were the home of the Middle-Dnipro culture and Bilohrudivka culture. The tribes of the Corded Pottery culture, Funnel Ware culture, Globular Amphora culture, Trzciniec culture, and Lusatian culture inhabited Volhynia and parts of Podilia. The Komariv culture, Vysotske culture, and Noua culture evolved in the Dnister Basin, and the Stanove culture, in Transcarpathia.\n" +
                "\n" +
                "The Iron Age. During the Iron Age, significant changes occurred in the material culture of Ukraine's inhabitants, particularly in agriculture, metallurgy, and commerce. In the early 1st millennium BC Iranian peoples—Cimmerians—appeared on the territory of the Dnipro River and Boh River basins in southern Ukraine. Archeological evidence shows that they, like the tribes of the indigenous Timber-Grave culture, Bilohrudivka culture, Bondarykha culture, and Chornyi Lis culture, had iron implements. In the 8th century BC, the Cimmerians were displaced by the Scythians, tribes of nomadic horsemen from Central Asia that intermingled with and assimilated the indigenous peoples and founded an empire that lasted until the 2nd century AD. The Scythians' political and economic hegemony in the region was established after they repulsed the invasion of King Darius of Persia in 513 BC.\n" +
                "\n" +
                "From the 7th century BC, Greek city-states founded trading colonies on the northern Pontic littoral. With time these towns became independent poleis (see Ancient states on the northern Black Sea coast), which interacted and traded with the other peoples of the region, particularly the Scythians, Taurians, Maeotians, Sindians, and Getae. In the late 5th century BC, the Hellenic towns on the Kerch Peninsula of the Crimea and Taman Peninsula united to form the Bosporan Kingdom. In the 1st century BC the Hellenic states were annexed by the Romans and remained under Roman rule until the invasions of new nomadic peoples: the Sarmatians, Alans, and Roxolani, Iranian-speaking tribes from Central Asia that had appeared in the Pontic steppes in the 4th century BC and had conquered most of the Scythians' territories by the 2nd century BC; and the Goths, Germanic tribes that arrived in the late 2nd century AD from the Baltic region and conquered the Sarmatians and other indigenous peoples. In the 3rd century the Goths waged war against the Romans and took most of their colonies on the Pontic littoral. Gothic rule collapsed in 375 under the onslaught of the Huns; most of the Goths fled west beyond the Danube River, and only a small number remained in the Crimea.\n" +
                "\n" +
                "The Hunnic invasion of Europe initiated what is known as the great migration of peoples from the East. After the Huns, the Ukrainian steppes were invaded by the Volga Bulgars in the 5th century, the Avars in the 6th, the Khazars in the 7th, the Magyars in the 9th, the Pechenegs and Torks in the 10th and 11th, the Cumans in the 11th and 12th, and the Mongols in the 13th.\n" +
                "\n" +
                "By the 2nd century BC, Ukraine's forest-steppe regions, Polisia, and part of the steppe were inhabited by the agricultural proto-Slavic tribes of the Zarubyntsi culture; Western Ukraine was populated by the tribes of the Przeworsk culture. By the 2nd century AD, the tribes of the Cherniakhiv culture populated large parts of the Ukrainian forest-steppe. Most scholars consider the territory bounded by the middle Dnipro River, the Prypiat River, the Carpathian Mountains, and the Vistula River to be the cradle of the ancient Slavs. By the 4th century AD, the Eastern Slavs of Ukraine had organized themselves into a tribal alliance called the Antes, whose domain stretched from the Dnister River to the Don River. In the early 6th century the Antes established relations with the Byzantine Empire, against which they also waged war in the Balkans. Their state lasted until the 7th century, when it was destroyed by the Avars and most of the Antes fled north to resettle in the upper Dnipro Basin.\n" +
                "\n" +
                "By the 6th century AD, the ancestors of the Ukrainians were divided into several tribal groups: the Polianians on the banks of the Dnipro River around Kyiv; the Siverianians in the Desna River, Seim River, and Sula River basins; the Derevlianians in Polisia between the Teteriv River and Prypiat River basins; the Dulibians, later called Buzhanians and Volhynians, in the Buh River basin; the White Croatians in Subcarpathia; the Ulychians in the Boh River basin; and the Tivertsians in the Dnister River basin. These tribes had ties with the proto-Belarusian Drehovichians, the proto-Russian Radimichians, Viatichians, and Krivichians, and the Baltic tribes to the north; the Bulgarian Kingdom (see Bulgaria) and the Byzantine Empire to the south; the Khazar Kaganate and the Volga Bulgars to the east; and the proto-Polish Vistulans and Mazovians, Great Moravia, and the Magyars to the west. They also traded with more distant lands via international trade routes: the route ‘from the Varangians to the Greeks’ linking the Baltic Sea and Black Sea mostly via the Dnipro River and thus joining Scandinavia with Byzantium (see Varangian route); the east-west route from the Caspian Sea to Kyiv and then to Cracow, Prague, and Regensburg, thus joining the Arab world with central and western Europe; and the route linking the Caspian and Baltic seas and thus the Arab world with Scandinavia. Because they lived along or at the crossroads of these important trade routes, the proto-Ukrainian tribes played an important economic and political role in eastern Europe.\n" +
                "\n" +
                "The tribes shared a common proto-Slavic language and pagan beliefs. They built their agricultural settlements around wooden fortified towns. Kyiv was the capital of the Polianians; Chernihiv, of the Siverianians; Iskorosten (Korosten), of the Derevlianians; Volyn (Horodok on the Buh River), of the Dulibians; and Peresichen, of the Ulychians. The Polianians were the most developed of the tribes; according to the Rus’ Primary Chronicle, their prince, Kyi, founded Kyiv in the late 6th century. Kyiv's strategic position at the crossroads of the trade routes contributed to its rapid development into a powerful economic, cultural, and political center. The tribal princes, however, were not able to transform their tribal alliances into viable states and thus protect their independence. In the early 8th century, the Polianians and Siverianians were forced to recognize the supremacy of the Khazar Khaganate and to pay tribute. In the mid-9th century, the warlike Varangians from Scandinavia invaded and conquered the tribal territories, and established the foundations for Kyivan Rus’ state with its capital in Kyiv.\n" +
                "\n" +
                "The Princely era. The leading role in this state until its demise some five centuries later was played by the princes (whence the name of this period). The Primary Chronicle states that the Eastern Slavs had invited the Varangians to rule over them. This source was later used to substantiate the so-called Normanist theory of the origins of Kyivan Rus’. The Riurykide dynasty that ruled Rus’ and other East European territories until 1596, originated with the Varangian Prince Riuryk of Novgorod. The most outstanding Varangian ruler of Kyivan Rus’ was Prince Oleh (Oleg), who succeeded Riuryk in Novgorod ca 879. In 882 he killed Askold and Dyr and took power in Kyiv, which became the capital of his realm. He then conquered most of the East Slavic tribes, thus becoming the undisputed ruler of a vast and mighty state. After consolidating his power and eliminating the influence of the Khazars on his territory, Oleh undertook an expedition against Constantinople, forcing it to sue for peace and to pay a large indemnity in 907. In 911 he concluded an advantageous trade agreement and laid the basis for permanent trade links between Kyivan Rus’ and the Byzantine Empire.";
        StringBuffer s = new StringBuffer(line);

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (terminalSymbol.indexOf(line.charAt(i)) != -1) { // If the delimiters string contains the character
                sentenceCount++;
            }
            if (sentenceCount % 2 == 1 && (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                s.setCharAt(i, Character.toUpperCase(c));
            }
            if (sentenceCount % 3 == 1 && (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {

            }

        }
        System.out.println("The number of sentences is " + sentenceCount);
        System.out.println("The number of word is " + wordCount);
        System.out.println("The number of data is " + dataCount);
        System.out.println("Replaced " + s);
    }
}