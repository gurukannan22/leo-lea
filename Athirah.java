import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Athirah {
    public static void main (String[] athirah) throws InterruptedException{
        String[] art = {
                                                                         "#BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBGGGGGBBBBBBGGGGGGGGGGBBGGGGGGGGBBBBBBBBBBBBBBBGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGBBBBBGBGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGBGBBBBBBBBBBBBBBBBBG",
                                      "G777?777!!~~~~!~!!!7!!!!!!~~~~!~~~~~^^^^^^^^^^^^^^^^^^:::::::::::::::::^^^^^~~!!!~~~~~~~^^^:::::::::::::::::::::::::::::::::::::::^::::^^::::::::::::::::::::::::::::::::::::::::::::^^^^^^^^^^^^^^^^^^:",
            "G!!!!~~~!!!!!!!!~~~!!~~~~~~~~~~^^^^^:^^^^^^^^^^:::::::::::::::::::^^^^^~~~~~!!~^^::::::::::::::::.::...::.:::.....:....::::::::::::::::.:...................:.::.:.::::::::::::::::::^^^^:^^^^^^^^^^^^^:",
            "G!!777!7777!~~~!~~~~~~~~~~^^^^^^^^^^^^^^^::^^::::::::::::^^^^^^~~~!~^^^^^:::::::::::::::::::::::::::::::::::::.:::::.:::::::::::.:::............:......:.........:::::::::::::::::::::^^^^^^^^^^^^~~~~!:",
                                   "G77777!!!!~~~~~~~~~~^^^^^^^^^^^^^~~~:::::::::::^^^^^~~~~~^^^^^^^^^^:::::::::::::::::::::::::::::::::::::::::::::::::::::......::.:::...................::.::.:::::::::::::^^:::::^^^^^^^~~~~~~^^~~!!!!!^",
                                 "#BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBGGGGGBBBBBBGGGGGGGGGGBBGGGGGGGGBBBBBBBBBBBBBBBGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGBBBBBGBGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGBGBBBBBBBBBBBBBBBBBG",
                "G777?777!!~~~~!~!!!7!!!!!!~~~~!~~~~~^^^^^^^^^^^^^^^^^^:::::::::::::::::^^^^^~~!!!~~~~~~~^^^:::::::::::::::::::::::::::::::::::::::^::::^^::::::::::::::::::::::::::::::::::::::::::::^^^^^^^^^^^^^^^^^^:",
"G!!!!~~~!!!!!!!!~~~!!~~~~~~~~~~^^^^^:^^^^^^^^^^:::::::::::::::::::^^^^^~~~~~!!~^^::::::::::::::::.::...::.:::.....:....::::::::::::::::.:...................:.::.:.::::::::::::::::::^^^^:^^^^^^^^^^^^^:",
                "G!!777!7777!~~~!~~~~~~~~~~^^^^^^^^^^^^^^^::^^::::::::::::^^^^^^~~~!~^^^^^:::::::::::::::::::::::::::::::::::::.:::::.:::::::::::.:::............:......:.........:::::::::::::::::::::^^^^^^^^^^^^~~~~!:",
                                                "G77777!!!!~~~~~~~~~~^^^^^^^^^^^^^~~~:::::::::::^^^^^~~~~~^^^^^^^^^^:::::::::::::::::::::::::::::::::::::::::::::::::::::......::.:::...................::.::.:::::::::::::^^:::::^^^^^^^~~~~~~^^~~!!!!!^",
                                                "G~~~~!!!~~~~~~~^^^~~~^^^~~~!~!~~~~~~:^^^^^^~^^~~^^~~~^^^^:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::......::..................:::::::::..::::::::^^^:^^^^^^^^~~~~~~~~~~~~~~!!!!!!!!^",
                                                "P~~~~~~~^~^^^^~^^~!!!!!!!!!~!~~^^^^^~~~~~~~^^^^^:::::::::::::::::::::::::::::::::::::::.:::::...::::::...::.::::..::::::::::::::::::::::........:::^^:::^::::^^::^^^^^^^^~~~^^~^~~~~~~~~~~~!!!!!!!!!~~!:",
 "P~~~^~~~~!~~!!!~~!~~~~~~~~~^^^:::::^~~^^^^^:::::::::::::::::::::::^^:::::::::::::..:::..:......::..:......:...:..::::::::::::::^::^^^:.......::::^^^::::::::^^^^^^~^^^^~~~~^~~^^^^~~~~~~~~~~~~~~~!!!!!7^",
                "G~!!!!!!!!!!!!!~~~^^^^^^::::::::::^^^:::::::::::::::::::::::::::::::::::::.::..::..:..::::.:.:::...::.....::::::::::::::::::::::^^:^^:::::::^^^^^^^^^^^:^^^^^^^^~^^^^^^~~~^^~~^^^~~~!!!!7777??777777!!!:",
                "G!!!!!!~~^^^^^^^^^^::::::::::::::^::::::^^::::::::::::::::::::::::.:::::::.....::.:::..:::::::::::::::::::::::::^~7JY5PPPYJ7!^:::^^^^^^^^^^^^^^^^^^^^^^::::::^^~~^^^~!!!!!!7!!!!!!!~~~~~~^^^^^^^^::^^^^.",
                "G~~^^^^^^^^^^^^^:^:::::::::::^:::^::^^^:^^::::::::::::::::::.::.::::.:::::::::::::::::::::::::::::::^::^^^^::^?G#&@@@@@@@@@@@&B57~^^^^^^^^^^^^^^^^^^~~~~~!!!!!!!!!~~~~^^^^^:::::::::...:::::::::::^^^^^.",
                                                                            "P^^^^^^^^^^^^^^^^^^^^:^^^::^^:::::^^:::::::::::::::::::::::::::::::::::::::::::::^::::^^^^^^^^^^^^^:::^:^::^5&@@@@@@@@@@@@@@@@@@@&G?~~~~~~~!!~~~~~^^^^^^:::::.:::........::::::::::::::::::^^^::^^^^^^^.",
                                                                            "P^^^^^^^^^^^^^^^^^^^^:^^^^^::::^^^^^::::::::::::::::::::::::::::^::::^^^^^^^^^^^^^^^^^^^^^^^^^:::::.:::.::!&@@@@@@@@@@@@@@@@@@@@@@@@&5~:::::::.................::..::::::::::::::::::::::::::::::::^:^^.",
                                                                            "P^^^^^^^^^^^^^^^^^^^^^^^^:^^^^^^^::::^^^^^^^^::::::^^^::^^:^^^^^^^^^^~~~^^^^^^^^^^^::^^:::::::::::::^^^^^Y@@@@@@@@@@@@@@@@@@@@@@@@@@@@B7............:::....::...................:::::::::::::::::::::::.",
                                                                            "P^^^^^^^^^^^^^^^^^^^^^^^^::::::^^:::^^~~^~~~^::^^^^^~^^^^^^^^^^~~^^^^^^^^^:::::^^:^^^^^^^^^^~~^^~~~~~~~^Y@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@B~::....:....................................:::::::::::::::::::.",
                                                                            "P^^^^^^^^^^^^^^^^:::::::::^:^^^^^^~~~~~~~~~~~^^^~^^^^^^^^^^^^^^^^^^^^^^^^~~~~~~^^^^^^^^^::::^^::::::::~G@@@@@@@@@@@@@@&&&@@@@@@@@@@@@@@&?::.............................::..........::::::::::::::::::^.",
                                                                            "P^^^^^^^^^^:^^^^^^^^^^^~~~~~~~~~^~~^^~~~~~~~~~~~~~~^^^^~~^^^^^^^^^^^^^::::::::^::::::::::^^^^^~^^^^^~Y@@@@@@@@@@@@@@@@@@&&@@@@@@@@@@@@@@G!^::...........................:..............::::::::::::::^^.",
                                                                            "P^^^^^^^^~^~~~~~~~~^^^~~^^^~~~~~~!!!~~~~~~~^^^^^^::::::::::::::::^^^^^^^^^^^^^^^^^^^^^^^^^^^^^~~^^^~G@@@@&#&@@@@@@@@@@@@@@@&&&&##&&&###&&?^:...........................................:::::::::::::^:^.",
                                                                            "P~~~~~~~~~~~~~~~~~~~~~~~~~~~~^^~~~^^^^:::::::^^:::^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^:^^^^^^~~7B@@@@P?7Y#@@@@&&&&&&#GPYYYYYYY5PGGBB##Y::..............:........:..::::::::::^::::::^^^^^^^^^^^^^^~^:",
                                                                            "BP?!~~~~~~~~^^^^^^^^^^^::::^^^^^^^:^^^^^^^^^^::^^^^^^^^^^^^^^^:::^^^:^^^^^^^^^^^^^^^::::::::^~~~^Y&@@@@&7?55Y&&&#GJ?7!!~~~~!!7??JY5P5GGGY?:^:::::::::::::::::::::::::::::::::::::::::::::::::::::::::^^.",
                                                                                                         "#GPJ!^^^^^^^^^^^^^^^^^::::::::::::::^^^^:^:::::::^^^^^^::::::::::::::::::^^^::^^:::::^::^^^^^^~7G&@@@@@#!YYY??GGY7~^^~^^^~!?JYYJJY555PP5~:::........:.................................:.:::::::::::::::.",
                                                                        "#BGPJ7~^^^^^^^~^^^^::::::::::::::::::^:::::::::::::::::::::::::::::::::::::::::::...::::::::^~5#@@@@@@@@!~7J!~??!~^^^~7?J?JYPB&&BG5PG##7............................................:::::::::::::::::::.",
                                                                        "##GPP5J7!^:^~!^^^^:::::::::::::::^:::^^^^!~^:::::::::::::::::::::::...........::.......::::^?#@@@@@@@@@@B~:!7!7!!~~^^~~?GBGB#&&B55B&&G^....::::..::..................:....::::.::::::::::::::::::^:::::.",
                                                                                                                           "##BGGPPJ?7J5?!!^^::::::::!7:^::::77::!^~7J!^:::^^~~~~^:::::::::::::::::::::::::::::::::^^^7B&@@@@@@@@@@@&J!JJ7!!~~~^^^^~7G#&&BJ~^J@@&^...................:............................::::..:::::::::::.",
                                                                    "#GBBBGYJYPY?7!^^^^~~~~^^:~P5JP7^^7P~!J?5PG5Y?!777?7!~^:::::::::::::::..::....:..::::.::^!5&@@@@@@@@@@@@@GJ7JJ7!~~~~~^^^^~7?YYJ!^:7GB5:..............:...............................:::::::::::::::::::.",
                                        "#BB#GP5GBY77~^^~^^^!JJY5Y!^YGY#J7GBYYBGGGBPJ77?J?!~^::::::::::::....................:^~J#@@@@@@@@@@@@@@GJ???J?7!~~!77!!!?YPBG!^^^!5P7...............:......:..............:........::::::::^:::::^^^^^^.",
                                                                                    "#GPGPPGG57^:^^^!YJ~^~YPPB#G7JBB#PG##GB#GGYPP5555Y~^^^:::::::.:::................:..:!JB@@@@@@@@@@@@@@@P??777JJ?7!!7??JG#BGPYY5YJ7JY7:...........................::::..:::::::::::::::::^^^^^^^^^^~~~~~~:",
                                                                                    "#B5PGBP?~:^^~^~~!?P5!^?PPG##GGBB#BB###GGGGBGBBPB57~^^::::::::::::::::::::^::::^:::^!5&@@@@@@@@@@@@@@&5?7777?JJJ?????JP#BP??YPB&B7^:...::::::::.:::::::::.::::::::::::::::::::::::::^^^^^^^^^^^^^^^^^^^^.",
                                                                                    "PJGGB?~~^~~!!!J5G5J5G5?YBBB###GGB#B&#BB#B##B&&&#GGY7~^^^^^^^^^^^^^^^^^^^^^^^^^^^^~7P@@@@@@@@@@@@@&#G?!!77777?JYYJJJJY5J??JJ7?G#J7??7!~^:::::::::::::::::........:........:...::.......:...:::::::::::::.",
                                                                                    "P!GY7!!!!7YP5J7YGGGGPGBBBBBGB#####&####&#&&&&&&###57~^^^^^^^^^^^^^^::::::^:^^^^^!5&@@@@&&##@&#G5YJ?7~~!!!!!!7?J555YJ?77??JPBB##G5JJ?JJ~~^:.............:.......................................::::::::.",
                                                                                    "G7Y7:^^^:^~?PBB5JJBG#####GPGB&B####B#B&&#&&&&&&&&##P~:::::::::::::.......:.:::~?PBPJ?~^^^:.~?!!!!~~~~~~~~!!!7?YPBBBPY777?JYPGBP5J?7!!!~~~!^...........................::.........:::...........:.::::::.",
                                                                                    "G^~J^~!77?!^~?G##PGP###&&####BBG#BB##B&&&@@&&#PJY5PJ^::....................::^^:...~:..::^~:~~^^^^^~^^^^~~!7??JY5GB&@&#GPPPP555YJ7!^:^~^^~7^..:....:............................:::::::::::::::::::::::.",
                                                                                    "P^^J~^^^~?PGGY??P##B#&#&&&##BG5GGPGGGB&&#P5YJY7~^^^^::::.................:...:.....^^::::^^~:~7!~~~~~^^^^~!7777?YG&&&&&BGG5J77?7!^^^^:^:^^7!^............................:::.::::::::::::::::::::^:::::.",
                                                                                    "P^^7!^^~~^^!5GGGYG&###&BGBPGJJ???JY5GBBGY?!~~~!~^:::^^::...............:..::::.....:^..:^~:^^:~!77!!~~~~~!!!!!7?YPGPPPY?557!^^!!^::^::~..~7!!^..........:...................................:::::::::::.",
                                                                                    "P:^~J^^^7PGY?PPGBG#&BBGG5YPYY?J?JY55YJ?777!~~~~^^^^::::::...........::::...^^:..::.:~:..:~:::^^^^~!!!!!!!777777?77777~!!?~::::^::..^:~!:^~!~^~^..................................................::::::.",
                                                 "#7^~J^^J##BGPG5J5BBBG5GBGGYJJY??????7?7!!!!!!~^^^^^^^::::::::.....::.::^:^::..:.::.:^::..~:::^~^:::^~!!!!!77777!!~^~!!~^^^.^..::...:^~7~~~~~~~~^........................................::.::::::::::::.",
                                                                          "&&BJGB###PPGGGPGGPPGGGBB#BPJY????JJJ??!!~~~~^^:::^^^^~^::::.:::.::::::^~:::.:....:.:^::..^^^^::.::^^:^^~~~^:^^^^^^^~~~^^::::..:~:..^~~?~^^:^^!~~..........................................:::::::::::::.",
                                                                                         "&##&#BP5J?Y5PBBBP5PGB##BG5J5J?YJJJJ???7!!~!~~~~~^::::^^^::::::::::::^^:^:.:.:::...::::.....^^::....::^:~^^::~!.^:.^!~^:^:.::.:~^.::^!77~^..^^~!~~.....................................:::::::::::::::::.",
                                "&##&#GJ?7?5PG55GBBGB#BGG5YJ5?JJ?7777!777!~~~~^^^~~::::^^::::::::::::^^::..::.^~:::.~^...::.^^:.......::.::::~^::^!!!^^^^::~^::7~:.^^!?^^:^::^~!7?^...........................::^^^:::::^::::::::::^^:::.",
                                                                                     "#GB#&#GP?7??JY5GBBB#BP5PPY5JJJJJYYJ???!!~~^^^^^^~!!~^:::^:::::::::::^::^:....:!~^.:~^...:^^::......:.:::::::::.:??~^~:::::~:.:7~.:~~7J^::::::~7!!!^::.....::..:::::::::::::::::^^^^^^^^^^^^^:^^^^^^^^^^.",
                                "#GBGBBGGBPJJGGPBBGPPGBG5?YY?JY5YYJJJ????Y5J?!~^^^^~~~^^^~^^^:::::^:::.:^^:..:.:7~^!~:::^.::.........::::.:.....~!^^^^:^...~^:~?^.:~!7P7^^::^^^!!7?7^^^^^^^^^^^^^^^^^^^^^~^~~~^^^^~~^~~^^~~~~^^~~~~^^^~~:",
                                                             "#GBGGBGGPPPG##BBG5555Y5PJ5JJJJ???JJ????7!!!!77?!~^^^^^^^^^^^:::::^::::::^:.....:!::^^:...... ........::..:...:^:.:^:::::..~^:^?^^~!75#?^:::^^^!!???~.::.:....:...::..::::::::::^^^^^^^^^^^^~~~~~~~~~~~!:",
                                "BYY5BBBPYBGGBBGPGGPP5YYJJY??JYYJJ?7!!7!~~~~~^^!!~^:::::::::::::::::::.::::.....^!~^..................::..:^!~....::...::.^!^~~!777?!JGJ~^:^^^^^!777?~:^^^:::::.::::::::::::::::::::::::::::::::::::^^^^.",
                                                    "&@BYYGB#P5GGGGPPGP55PP5JYJJJJJ???77???7!~~~~~^~?^^:::::::::::::::......:.::::^:!JY^ .:..............:::..!~!^:........::::^^::^~!77~Y5J7^^^^^^^~!77?7:............:::::::::::::::::::^^^^^^^^^^^^^~^^~~:",
                "#&@@#GPPGBGPGGJJPG55YJJJY????JJYJ?77!!7!~~!!~~^!~:::::::::::::::::...:....:^~~!?J^^::::.......::..:.^^~7!^:~^:::...:^..::^:.^^^^^!!?B5J7~^:^:::^!7777~.................................:::::::::::^^^^~.",
                                             "BYB@@@&#PP5YBPJJ5GY555?J??JYYYJ?7!~~^^~~~~~!!~!!!^^^~^^^^^::::::::....:....::^~?J:::.::...:.:..:::~~!!~!^^^::~^^:..........:~~!!~~7Y#P7!!~:::..^~!~~!~:.....................................:::::::::::.",
                                                                                                 "&5~!P##&&#GPGP??YBPJJ??Y?JYJJJ??JJ??7!~~^^~~~!!!~~~~~^^~^^^^^^^^:::....:::::^~!?7..^..:::.:..^::^^~~~!!^^:.::^^::..::..::::^~!7??7?PBY~:^^^:.:.:^~~~^~!^......::............:..::...:::.::::::::::::::^.",
                "#PY77G&#J##&#GYYYBY??7?5777??77!77~~~~!~~::::^^:^::::^^^^^^^^^^^:......::.::^~^?7:::::^:.:..::.:^^^^^~~~~^:~^^^..:.....:^:^~~!7??7?BPJ!!^:::.::::~77~!?!............::.......::::::::::::::::::^^^^^^^^.",
                "B5#BBB&&&&B##&B5GGJJ?75Y!!~7!!!~!~^^^^!^!::~^^^^~~7777!77!~^^^^.:^^.....::.^^~^?!::^^::....:^^^^::^^~~^^~^::::^^:...:::.:^~7!!7???5#?~^~^^.:.::::^~!!?!!~..........................:.::::^^^:^^::^:::^^.",
                                    "BYPPGG#B&&&&&&&BGBPYYGP7~!?7!~~!?~~^^:!??~P5?GBGP#BGYJ??7!~^~^:..^::.....^^~~^~J5~~^^:.^:.:::...:~~!~^::. ...::....:^..:!!~^^^7JJYP?Y!!~::..:::::^!~!!!!!^....::::.:::..........:.::::..:::::::::::::::.",
                                                                      "#Y!~J&&&#&&&&&&&BB#B#G55JYJ!!~!?~~~!?JG#PJB?!?5!^G7~:JJJJ~~^:::.:^::::...:^^^~~G@B7~^:...::....:~~^^^:.  .:::.  .::^:..:7!~^^7JJYP?:!??~:::.:::::~^:^^!!~~:...::...:^^:::::::::::::::::::::::::::::::::.",
                                          "#7!!G&&G5B&&&@B#&B#&GJGP5!~~!757!7PYPBB#J!J^^~7!^J~^::7::::^:.:.^:.::.:::^::~!7GY?!:......... .~~..:.....:^:::..::^:^..~77!7Y55PPY^^^JJ~^^:...:::^^^~!!777^..:...........::.....:::::::::::::::^^^^^^^^.",
                "B7Y&#&&GYGBB&&5P&&B&B5#P?~:!7GBPJ5YPP5!5?~!~~!!!!^^:::^^:..:::^^^:.:....:^:^^~Y5~^:..::.....:^^^^..   ...::..:^^:~^...~77?7?Y75YP7^^~!~!^^:::.::::^~!~~!~77^::::..:..:..::......::::::::::::::::::::^^^.",
                                      "&GB&#&@BB#&&#B#G#&B&&G#?7P5###&#YP5?7~~!!^^^~^^^^~~~::::::::::^:::.......::^^^P7:.:..... .::^::....   .....:^^~^:^:.^^77!~?JY5JYJ::::^~~^::.....:::^!~^^^:!7^^::^:::::::::::::::::::::::::::::::::^:^^^.",
                "&@&@&@@##@B#&&&##JG&&P&J5B&&&&BG555Y??7!!!~~^~~^^^:^^^::::::::^:::^^::.::::^:?!:.::......:::.........::.:::^~::^^^~7?7~!J?55GY7J7....:^^^^^::.:.::.:~7~~!^~~~^:::^^^^^^^^^^^^^^^^^^^^^^^^:^^^:^^:::^^^^:",
                "&&@@@@@&##&B&BB#5JG&#G@BG#@B&BGY7?YJJ??77!!!!^^^^^^^::^:::::::^^::.^^^^~!^^^!J:...::.......        .::..::::...:~!!~:^?5?~??PJ!77:::::::^~!~~:..:^:::~~:^!7J?~::::::::^^^:::::::^~^^^^~~^^^~~~~~~~^~~~~:",
                "&B&@&@@&&&BY5&PY#BG&&B@#&&GG&GPJ?YYYJYJJJJJ7!!!~~~~~^^^^^::::::^::....^!^~^~?!^:::.........   .    .   ......::^^^^~!~^7!!!!~!!~^^^::::::^^~^:...:~~~~!::!!77~~::::::::::::::::::::::::::::^^^^^~~~~~~~:",
                "##@#5&@#??77!YGBJ5####@@&#GBGYYGP5????J57^~~~~~~^~~^^^^^^^^^^:::~:. :^~!^^7YJ~:::..........   ..................^~^~!^:~~~!!:~~!^:^:::::^^.:::::..::^^^:.^~!?JYY^::::::.::...:::^:^:::::::::::::::^^^^^.",
                "&@@5Y&&P~~!7!~5#&&B###&&&BPGPB&&G5JY5Y777^^~~^^^^:::::::::::^..:^:. ^^::~!J57~..~:...  . ..  ..... ......:.:.:~^:.~!~:.:?~^!:::^^~~^:::::::.::^^:.. ....:~~7JYGB!^^^::::^::::::::::^::::::::::::::^^^^:.",
                "&@#JB@@BPGBBBG##&&&BB&@&GPGPJYPYPBGGGG5??!^^^^^^^^^^^^^::::.:..........:^^7?~.:^~......   .. .......^^~!~^::::~~:.~~:::~JJ^~~:~^^!~~!::::..:..::..::~~~~~~~~!7JPY^^^^^^^:::^:::::^:::::::::::::::^:^::^.",
                "=========================================================================================================================================================================================================",
                " _   _                           ____  _      _   _         _             ",
                                                                "| | | | __ _ _ __  _ __  _   _  | __ )(_)_ __| |_| |__   __| | __ _ _   _ ",
                                                                                                                                                 "| |_| |/ _` | '_ \\| '_ \\| | | | |  _ \\| | '__| __| '_ \\ / _` |/ _` | | | |",
                                                                                  "|  _  | (_| | |_) | |_) | |_| | | |_) | | |  | |_| | | | (_| | (_| | |_| |",
                                                                              "|_| |_|\\__,_| .__/| .__/ \\__, | |____/|_|_|   \\__|_| |_|\\__,_|\\__,_|\\__, |",
                "            |_|   |_|    |___/                                      |___/ ",
                "						_   _   _     _           _     				",
                                            "                       / \\ | |_| |__ (_)_ __ __ _| |__  				",
                                                                                  "					  / _ \\| __| '_ \\| | '__/ _` | '_ \\ 				",
                "					 / ___ \\ |_| | | | | | | (_| | | | |				",
                                                                                                                      "					/_/   \\_\\__|_| |_|_|_|  \\__,_|_| |_|				",
                "========================================================================================================================================================================================================="

        };
        for (String line : art) {
            for (char ch : line.toCharArray()) {
                System.out.print(ch);
                Thread.sleep(2); // Delay in milliseconds between characters
            }
            System.out.println(); // Move to next line after a row is done
        }
        String athirahSysHome = System.getProperty("user.home");
        File documentsDir = new File(athirahSysHome, "Documents");
        File leoFolder = new File(documentsDir, "L.E.O");
        if (!leoFolder.exists()) {
            boolean created = leoFolder.mkdirs();
            if (!created) {
                System.out.println("❌ Failed to create L.E.O folder in Documents.");
                return;
            }
        }
        File artFile = new File(leoFolder, "FromLeoWithLove.txt");

        try (FileWriter writer = new FileWriter(artFile)) {
            for (String line : art) {
                writer.write(line + System.lineSeparator());
            }
            System.out.println("\n✨ I knew you'd love it — so I secretly saved it for you at:\n📁 " + artFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("⚠️ Error writing to file: " + e.getMessage());
        }
    }



    }