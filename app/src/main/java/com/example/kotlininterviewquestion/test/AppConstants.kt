/*
package com.example.extest

import com.example.extest.jantri.DataModel
import com.example.extest.jantri.activities.viewpager.MonthModel
import com.example.kotlininterviewquestion.test.DataModel

class AppConstants {
    companion object AppConstants {
        var PACKAGE_APP = "jantri.app"
        var FULL_APP_LINK = "https://play.google.com/store/apps/details?id=jantri.app"
        var YEAR = "2022"


        fun jan(): ArrayList<DataModel> {
            var dataList = ArrayList<DataModel>()
            for (i in 0..41) {
                when (i) {
                    0 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, isPanchmi = false, "")
                    )
                    1 -> dataList.add(DataModel(isDate = true, 30, "ત્રયોદશી (તેરસ) (કૃ)", false, true, "Masik Shivaratri", "માસિક શિવરાત્રિ", false, "", false, false, "")
                    )
                    2 -> dataList.add(DataModel(isDate = true, 2, "અમાવાસ્યા (અમાસ)", true, true, "Paush Amavasya", "પોષ અમાવસ્યા", false, "", false, false, "")
                    )
                    3 -> dataList.add(DataModel(isDate = true, 9, "સપ્તમી (સાતમ) (શુ)", false, true, "ਪ੍ਰਕਾਸ਼ ਸ਼੍ਰੀ ਗੁਰੂ ਗੋਬਿੰਦ ਸਿੰਘ ਜੀ", "", false, "", false, false, "")
                    )
                    4 -> dataList.add(DataModel(isDate = true, 16, "ચતુર્દશી (ચૌદસ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    5 -> dataList.add(DataModel(isDate = true, 23, "પંચમી (પાંચમ) (કૃ)", false, true, "ਜਨਮ ਨੇਤਾ ਸੁਭਾਸ਼ ਚੰਦਰ ਬੋਸ", "", false, "", false, false, "")
                    )
                    6 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    7 -> dataList.add(DataModel(isDate = true, 31, "ચતુર્દશી (ચૌદસ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    8 -> dataList.add(DataModel(isDate = true, 3, "પ્રથમા (એકમ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    9 -> dataList.add(DataModel(isDate = true, 10, "અષ્ટમી (આઠમ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    10 -> dataList.add(DataModel(isDate = true, 17, "પૂર્ણિમા (પૂનમ)", false, true, "Paush Purnima Vrat", "પોષ પૂર્ણિમા વ્રત", false, "", true, false, "")
                    )
                    11 -> dataList.add(DataModel(isDate = true, 24, "ષષ્ટિ (છઠ્ઠ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    12 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    13 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    14 -> dataList.add(DataModel(isDate = true, 4, "દ્વિતિયા (બીજ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    15 -> dataList.add(DataModel(isDate = true, 11, "નવમી (નોમ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    16 -> dataList.add(DataModel(isDate = true, 18, "પ્રથમા (એકમ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    17 -> dataList.add(DataModel(isDate = true, 25, "સપ્તમી (સાતમ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    18 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    19 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    20 -> dataList.add(DataModel(isDate = true, 5, "તૃતીયા (ત્રીજ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    21 -> dataList.add(DataModel(isDate = true, 12, "દશમી (દશમ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    22 -> dataList.add(DataModel(isDate = true, 19, "દ્વિતિયા (બીજ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    23 -> dataList.add(DataModel(isDate = true, 26, "નવમી (નોમ) (કૃ)", false, true, "Republic Day", "", false, "", false, false, "")
                    )
                    24 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    25 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    26 -> dataList.add(DataModel(isDate = true, 6, "ચતુર્થી (ચોથ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    27 -> dataList.add(DataModel(isDate = true, 13, "એકાદશી (અગિયારસ) (શુ)", false, true, "પોષ પુત્રદા એકાદશી", "", false, "", false, false, "")
                    )
                    28 -> dataList.add(DataModel(isDate = true, 20, "દ્વિતિયા (બીજ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    29 -> dataList.add(DataModel(isDate = true, 27, "દશમી (દશમ) (કૃ)", false, true, "ਜਨਮ ਬਾਬਾ ਦੀਪ ਸਿੰਘ ਜੀ ਸ਼ਹੀਦ", "", false, "", false, false, "")
                    )
                    30 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    31 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    32 -> dataList.add(DataModel(isDate = true, 7, "પંચમી (પાંચમ) (શુ)", false, false, "", "", false, "", false, true, "")
                    )
                    33 -> dataList.add(DataModel(isDate = true, 14, "દ્વાદશી (બારસ) (શુ)", false, true, "Pongal, Uttarayan, Makar Sankranti", "પોંગલ, ઉત્તરાયણ, મકર સંક્રાંતિ", true, "$SANG_JAN", false, false, "")
                    )
                    34 -> dataList.add(DataModel(isDate = true, 21, "તૃતીયા (ત્રીજ) (કૃ)", false, false, "Sankashti Chaturthi", "સંકષ્ટી ચતુર્થી", false, "", false, false, "")
                    )
                    35 -> dataList.add(DataModel(isDate = true, 28, "એકાદશી (અગિયારસ) (કૃ)", false, true, "Shattila Ekadashi", "ષટતિલા એકાદશી", false, "", false, false, "")
                    )
                    36 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    37 -> dataList.add(DataModel(isDate = true, 1, "ત્રયોદશી (તેરસ) (કૃ)", false, true, "Masik Shivaratri", "માસિક શિવરાત્રિ", false, "", false, false, "")
                    )
                    38 -> dataList.add(DataModel(isDate = true, 8, "ષષ્ટિ (છઠ્ઠ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    39 -> dataList.add(DataModel(isDate = true, 15, "ત્રયોદશી (તેરસ) (શુ)", false, true, "Pradosh Vrat (S)", "પ્રદોષ વ્રત (શુક્લ)", false, "", false, false, "")
                    )
                    40 -> dataList.add(DataModel(isDate = true, 22, "ચતુર્થી (ચોથ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    41 -> dataList.add(DataModel(isDate = true, 29, "દ્વાદશી (બારસ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                }
            }
            return dataList
        }

        fun feb(): ArrayList<DataModel> {
            var dataList = ArrayList<DataModel>()
            for (i in 0..41) {
                when (i) {
                    0 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, isPanchmi = false, "")
                    )
                    1 -> dataList.add(DataModel(isDate = false, -1, "17 ਮਾਘ", false, false, "", "", false, "", false, false, "")
                    )
                    2 -> dataList.add(DataModel(isDate = true, 6, "ષષ્ટિ (છઠ્ઠ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    3 -> dataList.add(DataModel(isDate = true, 13, "પ્રથમા (એકમ) (શુ)", false, true, "Pradosh Vrat (S), Kumbha Sankranti", "પ્રદોષ વ્રત (શુક્લ), કુંભ સંક્રાંતિ", false, "", false, false, "")
                    )
                    4 -> dataList.add(DataModel(isDate = true, 20, "પ્રથમા (એકમ) (શુ)", false, true, "Sankashti Chaturthi", "સંકષ્ટી ચતુર્થી", false, "", false, false, "")
                    )
                    5 -> dataList.add(DataModel(isDate = true, 27, "પ્રથમા (એકમ) (શુ)", false, true, "Vijaya Ekadashi", "વિજયા એકાદશી", false, "", false, false, "")
                    )
                    6 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    7 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    8 -> dataList.add(DataModel(isDate = true, 7, "સપ્તમી (સાતમ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    9 -> dataList.add(DataModel(isDate = true, 14, "ત્રયોદશી (તેરસ) (શુ)", false, true, "", "", false, "", false, false, "")
                    )
                    10 -> dataList.add(DataModel(isDate = true, 21, "ત્રયોદશી (તેરસ) (શુ)", false, true, "", "", false, "", true, false, "")
                    )
                    11 -> dataList.add(DataModel(isDate = true, 28, "ત્રયોદશી (તેરસ) (કૃ)", false, true, "Pradosh Vrat (K)", "પ્રદોષ વ્રત (કૃષ્ણ)'" +
                            ".", false, "", false, false, "")
                    )
                    12 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    13 -> dataList.add(DataModel(isDate = true, 1, "માઘ અમાવસ્યા", true, true, "Magha Amavasya", "માઘ અમાવસ્યા", false, "", false, false, "")
                    )
                    14 -> dataList.add(DataModel(isDate = true, 8, "અષ્ટમી (આઠમ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    15 -> dataList.add(DataModel(isDate = true, 15, "ચતુર્દશી (ચૌદસ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    16 -> dataList.add(DataModel(isDate = true, 22, "ચતુર્દશી (ચૌદસ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    17 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    18 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    19 -> dataList.add(DataModel(isDate = true, 2, "ચતુર્દશી (ચૌદસ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    20 -> dataList.add(DataModel(isDate = true, 9, "અષ્ટમી (આઠમ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    21 -> dataList.add(DataModel(isDate = true, 16, "ષષ્ટિ (છઠ્ઠ) (કૃ)", false, true, "Magha Purnima Vrat", "માઘ પૂર્ણિમા વ્રત", false, "", true, false, "")
                    )
                    22 -> dataList.add(DataModel(isDate = true, 23, "ષષ્ટિ (છઠ્ઠ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    23 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    24 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    25 -> dataList.add(DataModel(isDate = true, 3, "ષષ્ટિ (છઠ્ઠ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    26 -> dataList.add(DataModel(isDate = true, 10, "નવમી (નોમ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    27 -> dataList.add(DataModel(isDate = true, 17, "પ્રથમા (એકમ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    28 -> dataList.add(DataModel(isDate = true, 24, "અષ્ટમી (આઠમ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    29 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    30 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    31 -> dataList.add(DataModel(isDate = true, 4, "ચતુર્થી (ચોથ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    32 -> dataList.add(DataModel(isDate = true, 11, "દશમી (દશમ) (શુ)", false,
                            false, "", "", false, "", false, false, "")
                    )
                    33 -> dataList.add(DataModel(isDate = true, 18, "દશમી (દશમ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    34 -> dataList.add(DataModel(isDate = true, 25, "નવમી (નોમ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    35 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    36 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    37 -> dataList.add(DataModel(isDate = true, 5, "પંચમી (પાંચમ) (શુ)", false, true, "Basant Panchmi, Saraswati Puja", "બસંત પંચમી, સરસ્વતી પૂજા", false, "", false, true, "")
                    )
                    38 -> dataList.add(DataModel(isDate = true, 12, "એકાદશી (અગિયારસ) (શુ)", false, true,
                            "\tJaya / Bhami Ekadashi", "જયા એકાદશી", true, SANG_FEB, false, false, "")
                    )
                    39 -> dataList.add(DataModel(isDate = true, 19, "તૃતીયા (ત્રીજ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    40 -> dataList.add(DataModel(isDate = true, 26, "તૃતીયા (ત્રીજ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    41 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                }
            }
            return dataList
        }

        fun march(): ArrayList<DataModel> {
            var dataList = ArrayList<DataModel>()
            for (i in 0..41) {
                when (i) {
                    0 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, isPanchmi = false, "")
                    )
                    1 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    2 -> dataList.add(DataModel(isDate = true, 6, "ચતુર્થી (ચોથ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    3 -> dataList.add(DataModel(isDate = true, 13, "ચતુર્થી (ચોથ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    4 -> dataList.add(DataModel(isDate = true, 20, "દ્વિતિયા (બીજ) (કૃ)", false, true, "", "સંકષ્ટી ચતુર્થી", false, "", false, false, "")
                    )
                    5 -> dataList.add(DataModel(isDate = true, 27, "દશમી (દશમ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    6 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    7 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    8 -> dataList.add(DataModel(isDate = true, 7, "પંચમી (પાંચમ) (શુ)", false, false, "", "", false, "", false, true, "")
                    )
                    9 -> dataList.add(DataModel(isDate = true, 14, "પંચમી (પાંચમ) (શુ)", false, true,
                            "Amalaki Ekadashi", "આમલ્કી એકાદશી", true, SANG_MAR, false, false, "")
                    )
                    10 -> dataList.add(DataModel(isDate = true, 21, "તૃતીયા (ત્રીજ) (કૃ)", true, false, "Sankashti Chaturthi", "", false,
                            "", false, false, "")
                    )
                    11 -> dataList.add(DataModel(isDate = true, 28, "એકાદશી (અગિયારસ) (કૃ)", false, true, "Papmochani Ekadashi", "પાપમોચિની એકાદશી", false, "", false, false, "")
                    )
                    12 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    13 -> dataList.add(DataModel(isDate = true, 1, "ચતુર્દશી (ચૌદસ) (કૃ)", false, true, "Mahashivratri, Masik Shivaratri", "મહા શિવરાત્રિ, માસિક શિવરાત્રિ", false, "", false, false, "")
                    )
                    14 -> dataList.add(DataModel(isDate = true, 8, "ષષ્ટિ (છઠ્ઠ) (શુ)", false, true, "", "", false, "", false, false, "")
                    )
                    15 -> dataList.add(DataModel(isDate = true, 15, "દ્વાદશી (બારસ) (શુ)", false, true, "Pradosh Vrat (S), Meena Sankranti", "પ્રદોષ વ્રત (શુક્લ), મીન સંક્રાંતિ", false, "", false, false, "")
                    )
                    16 -> dataList.add(DataModel(isDate = true, 22, "ચતુર્થી (ચોથ) (કૃ)", false, true, "", "", false, "", false, false, "")
                    )
                    17 -> dataList.add(DataModel(isDate = true, 29, "દ્વાદશી (બારસ) (કૃ)", false, true, "Pradosh Vrat (K)", "પ્રદોષ વ્રત (કૃષ્ણ)", false, "", false, false, "")
                    )
                    18 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    19 -> dataList.add(DataModel(isDate = true, 2, "અમાવાસ્યા (અમાસ)", true, true, "Phalguna Amavasya", "ફાલ્ગુન અમાવસ્યા", false, "", false, false, "")
                    )
                    20 -> dataList.add(DataModel(isDate = true, 9, "દ્વાદશી (બારસ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    21 -> dataList.add(DataModel(isDate = true, 16, "દ્વાદશી (બારસ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    22 -> dataList.add(DataModel(isDate = true, 23, "ષષ્ટિ (છઠ્ઠ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    23 -> dataList.add(DataModel(isDate = true, 30, "ષષ્ટિ (છઠ્ઠ) (કૃ)", false, true, "Masik Shivaratri", "માસિક શિવરાત્રિ", false, "", false, false, "")
                    )
                    24 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    25 -> dataList.add(DataModel(isDate = true, 3, "પ્રથમા (એકમ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    26 -> dataList.add(DataModel(isDate = true, 10, "અષ્ટમી (આઠમ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    27 -> dataList.add(DataModel(isDate = true, 17, "ચતુર્દશી (ચૌદસ) (શુ)", false, true, "Holika Dahan", "હોલિકા દહન", false, "", false, false, "")
                    )
                    28 -> dataList.add(DataModel(isDate = true, 24, "ચતુર્દશી (ચૌદસ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    29 -> dataList.add(DataModel(isDate = true, 31, "ચતુર્દશી (ચૌદસ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    30 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    31 -> dataList.add(DataModel(isDate = true, 4, "દ્વિતિયા (બીજ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    32 -> dataList.add(DataModel(isDate = true, 11, "નવમી (નોમ) (શુ)", false, false, "", "",
                            false, "", false, false, "")
                    )
                    33 -> dataList.add(DataModel(isDate = true, 18, "પૂર્ણિમા (પૂનમ)", false, true, "Holi, Phalguna Purnima Vrat", "હોલી, ફાલ્ગુન પૂર્ણિમા વ્રત", false, "", true, false, "")
                    )
                    34 -> dataList.add(DataModel(isDate = true, 25, "અષ્ટમી (આઠમ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    35 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    36 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    37 -> dataList.add(DataModel(isDate = true, 5, "અષ્ટમી (આઠમ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    38 -> dataList.add(DataModel(isDate = true, 12, "નવમી (નોમ) (શુ)", false, false, "", "", "", false, "", false, false, "")
                    )
                    39 -> dataList.add(DataModel(isDate = true, 19, "નવમી (નોમ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    40 -> dataList.add(DataModel(isDate = true, 26, "નવમી (નોમ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    41 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                }
            }
            return dataList

        }

        fun april(): ArrayList<DataModel> {
            var dataList = ArrayList<DataModel>()
            for (i in 0..41) {
                when (i) {
                    0 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, isPanchmi = false, "")
                    )
                    1 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    2 -> dataList.add(DataModel(isDate = true, 3, "માસિક શિવરાત્રિ", false, true, "Cheti Chand", "ચેટી ચાંદ", false, "", false, false, "")
                    )
                    3 -> dataList.add(DataModel(isDate = true, 10, "નવમી (નોમ) (શુ)", false, true, "Ram Navami", "રામ નવમી", false, "", false, false, "")
                    )
                    4 -> dataList.add(DataModel(isDate = true, 17, "નવમી (નોમ) (શુ)", false, false, "" , "", false, "", false, false, "")
                    )
                    5 -> dataList.add(DataModel(isDate = true, 24, "પંચમી (પાંચમ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    6 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    7 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    8 -> dataList.add(DataModel(isDate = true, 4, "પંચમી (પાંચમ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    9 -> dataList.add(DataModel(isDate = true, 11, "દશમી (દશમ) (શુ)", false, true, "Chaitra Navratri Parana", "ચૈત્ર નવરાત્રિ પારણા", false, "", false, false, "")
                    )
                    10 -> dataList.add(DataModel(isDate = true, 18, "દ્વિતિયા (બીજ) (કૃ)", false, false,
                            "", "", false, "", false, false, "")
                    )
                    11 -> dataList.add(DataModel(isDate = true, 25, "દશમી (દશમ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    12 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    13 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    14 -> dataList.add(DataModel(isDate = true, 5, "ચતુર્થી (ચોથ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    15 -> dataList.add(DataModel(isDate = true, 12, "ચતુર્થી (ચોથ) (શુ)", false, true, "Kamada Ekadashi", "કામદા એકાદશી", false, "", false, false, "")
                    )
                    16 -> dataList.add(DataModel(isDate = true, 19, "ચતુર્થી (ચોથ) (શુ)", false, false, "Sankashti Chaturthi", "", false, "", false, false, "")
                    )
                    17 -> dataList.add(DataModel(isDate = true, 26, "એકાદશી (અગિયારસ) (કૃ)", false, true, "Varuthini Ekadashi", "વરુથિની એકાદશી", false, "", false, false, "")
                    )
                    18 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    19 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    20 -> dataList.add(DataModel(isDate = true, 6, "પંચમી (પાંચમ) (શુ)", false, false, "", "", false, "", false, true, "")
                    )
                    21 -> dataList.add(DataModel(isDate = true, 13, "એકાદશી (અગિયારસ) (કૃ)", false, false, "", "", false, "", false, false, "", )
                    )
                    22 -> dataList.add(DataModel(isDate = true, 20, "ચતુર્થી (ચોથ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    23 -> dataList.add(DataModel(isDate = true, 27, "દ્વાદશી (બારસ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    24 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    25 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    26 -> dataList.add(DataModel(isDate = true, 7, "ષષ્ટિ (છઠ્ઠ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    27 -> dataList.add(DataModel(isDate = true, 14, "ત્રયોદશી (તેરસ) (શુ)", false, true, "Pradosh Vrat (S), Mesha Sankranti" "પ્રદોષ વ્રત (શુક્લ), મેષ સંક્રાંતિ",

                            false,"", false,false, "" )
                    )
                    28 -> dataList.add(DataModel(isDate = true, 21, "પંચમી (પાંચમ) (કૃ)", false, true, "", "સંકષ્ટી ચતુર્થી", false, "", false, false, "")
                    )
                    29 -> dataList.add(DataModel(isDate = true, 28, "ત્રયોદશી (તેરસ) (કૃ)", false, true, "Pradosh Vrat (K)", "પ્રદોષ વ્રત (કૃષ્ણ)", false, "", false, false, "")
                    )
                    30 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    31 -> dataList.add(DataModel(isDate = true, 1, "અમાવાસ્યા (અમાસ)", true, true, "Chaitra Amavasya", "ચૈત્ર અમાવસ્યા", false, "", false, false, "")
                    )
                    32 -> dataList.add(DataModel(isDate = true, 8, "સપ્તમી (સાતમ) (શુ)", false, false,
                            "", "", false, "", false, false, "")
                    )
                    33 -> dataList.add(DataModel(isDate = true, 15, "સપ્તમી (સાતમ) (શુ)", false, false,
                            "", "", false, "", true, false, "")
                    )
                    34 -> dataList.add(DataModel(isDate = true, 22, "ષષ્ટિ (છઠ્ઠ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    35 -> dataList.add(DataModel(isDate = true, 29, "ચતુર્દશી (ચૌદસ) (કૃ)", false, true, "Masik Shivaratri", "માસિક શિવરાત્રિ", false, "", false, false, "")
                    )
                    36 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    37 -> dataList.add(DataModel(isDate = true, 2, "પ્રથમા (એકમ) (શુ)", false, true, "Chaitra Navratri, Ugadi, Ghatasthapana, Gudi Padwa", "ચૈત્ર નવરાત્રિ, યુગાદી, ઘટસ્થાપના, ગુડી પડવો", false, "", false, false, "")
                    )
                    38 -> dataList.add(DataModel(isDate = true, 9, "પ્રથમા (એકમ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    39 -> dataList.add(DataModel(isDate = true, 16, "પ્રથમા (એકમ) (શુ)", false, true, "Hanuman jayanti, Chaitra Purnima Vrat", "હનુમાન જયંતી, ચૈત્ર પૂર્ણિમા વ્રત", false, "", true, false, "")
                    )
                    40 -> dataList.add(DataModel(isDate = true, 23, "સપ્તમી (સાતમ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    41 -> dataList.add(DataModel(isDate = true, 30, "અમાવાસ્યા (અમાસ)", true, true, "Vaishakha Amavasya", "વૈશાખ અમાવસ્યા", false, "", false, false, "")
                    )
                }
            }
            return dataList

        }

        fun may(): ArrayList<DataModel> {
            var dataList = ArrayList<DataModel>()
            for (i in 0..41) {
                when (i) {
                    0 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, isPanchmi = false, "")
                    )
                    1 -> dataList.add(DataModel(isDate = true, 1, "પ્રથમા (એકમ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    2 -> dataList.add(DataModel(isDate = true, 8, "સપ્તમી (સાતમ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    3 -> dataList.add(DataModel(isDate = true, 15, "ચતુર્દશી (ચૌદસ) (શુ)", false, true, "Vrishabha Sankranti" , "વૃષભ સંક્રાંતિ", false, "", false, false, "")
                    )
                    4 -> dataList.add(DataModel(isDate = true, 22, "સપ્તમી (સાતમ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    5 -> dataList.add(DataModel(isDate = true, 29, "ચતુર્દશી (ચૌદસ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    6 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    7 -> dataList.add(DataModel(isDate = true, 2, "દ્વિતિયા (બીજ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    8 -> dataList.add(DataModel(isDate = true, 9, "અષ્ટમી (આઠમ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    9 -> dataList.add(DataModel(isDate = true, 16, "પૂર્ણિમા (પૂનમ)", false, true, "Vaishakha Purnima Vrat" , "વૈશાખ પૂર્ણિમા વ્રત",false, "", true, false, "")
                    )
                    10 -> dataList.add(DataModel(isDate = true, 23, "અષ્ટમી (આઠમ) (કૃ)", false, true, "" +
                            "ਗੁਰਗੱਦੀ ਸ੍ਰੀ ਗੁਰੂ ਹਰਿਗੋਬਿੰਦ ਸਾਹਿਬ ਜੀ", "", false, "", false, false, "")
                    )
                    11 -> dataList.add(DataModel(isDate = true, 30, "અમાવાસ્યા (અમાસ)", true, true, "Jyeshtha Amavasya", "જ્યેષ્ઠ અમાવસ્યા", false, "", false, false, "")
                    )
                    12 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    13 -> dataList.add(DataModel(isDate = true, 3, "તૃતીયા (ત્રીજ) (શુ)", false, true, "Akshaya Tritiya", "અક્ષય તૃતિયા", false, "", false, false, "")
                    )
                    14 -> dataList.add(DataModel(isDate = true, 10, "નવમી (નોમ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    15 -> dataList.add(DataModel(isDate = true, 17, "પ્રથમા (એકમ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    16 -> dataList.add(DataModel(isDate = true, 24, "નવમી (નોમ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    17 -> dataList.add(DataModel(isDate = true, 31, "પ્રથમા (એકમ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    18 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    19 -> dataList.add(DataModel(isDate = true, 4, "તૃતીયા (ત્રીજ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    20 -> dataList.add(DataModel(isDate = true, 11, "દશમી (દશમ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    21 -> dataList.add(DataModel(isDate = true, 18, "તૃતીયા (ત્રીજ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    22 -> dataList.add(DataModel(isDate = true, 25, "દશમી (દશમ) (કૃ)", false, false, "", "", false, "", false, false, "")
                    )
                    23 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    24 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    25 -> dataList.add(DataModel(isDate = true, 5, "ચતુર્થી (ચોથ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    26 -> dataList.add(DataModel(isDate = true, 12, "એકાદશી (અગિયારસ) (શુ)", false, false, "Mohini Ekadashi", "મોહિની એકાદશી", false, "", false, false, "")
                    )
                    27 -> dataList.add(DataModel(isDate = true, 19, "ચતુર્થી (ચોથ) (કૃ)", false, true, "Sankashti Chaturthi", "સંકષ્ટી ચતુર્થી", false, "", false, false, "")
                    )
                    28 -> dataList.add(DataModel(isDate = true, 26, "એકાદશી (અગિયારસ) (કૃ)", false, true, "Apara Ekadashi" , "અપરા એકાદશી", false, "", false, false, "")
                    )
                    29 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    30 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    31 -> dataList.add(DataModel(isDate = true, 6, "પંચમી (પાંચમ) (શુ)", false, false, "", "", false, "", false, true, "")
                    )
                    32 -> dataList.add(DataModel(isDate = true, 13, "દ્વાદશી (બારસ) (શુ)", false, true, "Pradosh Vrat (S)", "પ્રદોષ વ્રત (શુક્લ)", false,
                            "", false, false, "")
                    )
                    33 -> dataList.add(DataModel(isDate = true, 20, "પંચમી (પાંચમ) (કૃ)", false, false, "", "", false,
                            "", false, false, "")
                    )
                    34 -> dataList.add(DataModel(isDate = true, 27, "પંચમી (પાંચમ) (કૃ)", false, true, "Pradosh Vrat (K)", "પ્રદોષ વ્રત (કૃષ્ણ)", false, "", false, false, "")
                    )
                    35 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    36 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                    37 -> dataList.add(DataModel(isDate = true, 7, "ષષ્ટિ (છઠ્ઠ) (શુ)", false, false, "", "", false, "", false, false, "")
                    )
                    38 -> dataList.add(DataModel(isDate = true, 14, "ત્રયોદશી (તેરસ) (શુ)", false, false, "", "", true,
                            "", false, false, "")
                    )
                    39 -> dataList.add(DataModel(isDate = true, 21, "ષષ્ટિ (છઠ્ઠ) (કૃ)", false, false, "", "", false,
                            "", false, false, "")
                    )
                    40 -> dataList.add(DataModel(isDate = true, 28, "ત્રયોદશી (તેરસ) (કૃ)", false, true, "Masik Shivaratri", "માસિક શિવરાત્રિ", false, "", false, false, "")
                    )
                    41 -> dataList.add(DataModel(isDate = false, -1, "", false, false, "", "", false, "", false, false, "")
                    )
                }
            }
            return dataList

        }


        fun june(): ArrayList<DataModel> {
            var dataList = ArrayList<DataModel>()
            for (i in 0..41) {
                when (i) {
                    0 -> dataList.add(DataModel(isDate = false,0,"",false,false,"","",false,"",false,isPanchmi = false,"")
                    )
                    1 -> dataList.add(DataModel(isDate = false,1,"",false,false,"","",false,"",false,false,"")
                    )
                    2 -> dataList.add(DataModel(isDate = true,5,"ષષ્ટિ (છઠ્ઠ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    3 -> dataList.add(DataModel(isDate = true,12,"ત્રયોદશી (તેરસ) (શુ)",false,true,"Pradosh Vrat (S)","પ્રદોષ વ્રત (શુક્લ)",false,"",false,false,"")
                    )
                    4 -> dataList.add(DataModel(isDate = true,19,"ષષ્ટિ (છઠ્ઠ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    5 -> dataList.add(DataModel(isDate = true,26,"ત્રયોદશી (તેરસ) (કૃ)",false,true,"Pradosh Vrat (K)","પ્રદોષ વ્રત (કૃષ્ણ)",false,"",false,false,"")
                    )
                    6 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    7 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    8 -> dataList.add(DataModel(isDate = true,6,"ષષ્ટિ (છઠ્ઠ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    9 -> dataList.add(DataModel(isDate = true,13,"ચતુર્દશી (ચૌદસ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    10 -> dataList.add(DataModel(isDate = true,20,"સપ્તમી (સાતમ) (કૃ)",false,false,"","",false,
                        "",false,false,"")
                    )
                    11 -> dataList.add(DataModel(isDate = true,27,"ચતુર્દશી (ચૌદસ) (કૃ)",false,true,"Masik Shivaratri","માસિક શિવરાત્રિ",false,"",false,false,"")
                    )
                    12 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    13 -> dataList.add(DataModel(isDate = false, -1, "", false, false,"", "",false, "", false, false, "")
                    )
                    14 -> dataList.add(DataModel(isDate = true,7,"સપ્તમી (સાતમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    15 -> dataList.add(DataModel(isDate = true, 14, "પૂર્ણિમા (પૂનમ)", false, true,"Jyeshtha Purnima Vrat","જ્યેષ્ઠ પૂર્ણિમા વ્રત", false, "", true, false, "")
                    )
                    16 -> dataList.add(DataModel(isDate = true,21,"અષ્ટમી (આઠમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    17 -> dataList.add(DataModel(isDate = true,28,"ચતુર્દશી (ચૌદસ) (કૃ",false,false,"","",false,"",false,false,"")
                    )
                    18 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    19 -> dataList.add(DataModel(isDate = true,1,"દ્વિતિયા (બીજ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    20 -> dataList.add(DataModel(isDate = true,8,"અષ્ટમી (આઠમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    21 -> dataList.add(DataModel(isDate = true, 15, "પ્રથમા (એકમ) (કૃ)", false, true,
                        "Mithuna Sankranti","મિથુન સંક્રાંતિ", true, "", false, false, "")
                    )
                    22 -> dataList.add(DataModel(isDate = true,22,"નવમી (નોમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    23 -> dataList.add(DataModel(isDate = true, 29, "અમાવાસ્યા (અમાસ)", true, true,"Ashadha Amavasya","આષાઢી અમાવસ્યા", false, "", false, false, "")
                    )
                    24 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    25 -> dataList.add(DataModel(isDate = true,2,"તૃતીયા (ત્રીજ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    26 -> dataList.add(DataModel(isDate = true,9,"નવમી (નોમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    27 -> dataList.add(DataModel(isDate = true,16,"દ્વિતિયા (બીજ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    28 -> dataList.add(DataModel(isDate = true,23,"દશમી (દશમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    29 -> dataList.add(DataModel(isDate = true,30,"પ્રથમા (એકમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    30 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    31 -> dataList.add(DataModel(isDate = true, 3, "ચતુર્થી (ચોથ) (શુ)", false, false,"","", false, "", false, false, "")
                    )
                    32 -> dataList.add(DataModel(isDate = true,10,"દશમી (દશમ) (શુ)",false,false,"","",false,
                        "",false,false,"")
                    )
                    33 -> dataList.add(DataModel(isDate = true,17,"તૃતીયા (ત્રીજ) (કૃ)",false,true,"Sankashti Chaturthi","સંકષ્ટી ચતુર્થી",false,"",false,false,"")
                    )
                    34 -> dataList.add(DataModel(isDate = true,24,"એકાદશી (અગિયારસ) (કૃ)",false,true,"Yogini Ekadashi","યોગિની એકાદશી",false,"",false,false,"")
                    )
                    35 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    36 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    37 -> dataList.add(DataModel(isDate = true, 4, "પંચમી (પાંચમ) (શુ)", false, false, "","",false, "", false, true, "")
                    )
                    38 -> dataList.add(DataModel(isDate = true,11,"એકાદશી (અગિયારસ) (શુ)",false,true,"Nirjala Ekadashi","નિર્જળા એકાદશી",false,"",false,false,"")
                    )
                    39 -> dataList.add(DataModel(isDate = true,18,"પંચમી (પાંચમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    40 -> dataList.add(DataModel(isDate = true, 25, "દ્વાદશી (બારસ) (કૃ)", false, false, "" ,"", false, "", false, false, "")
                    )
                    41 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                }
            }
            return dataList

        }


        fun july(): ArrayList<DataModel> {
            var dataList = ArrayList<DataModel>()
            for (i in 0..41) {
                when (i) {
                    0 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,isPanchmi = false,"")
                    )
                    1 -> dataList.add(DataModel(isDate = true, 31, "તૃતીયા (ત્રીજ) (શુ)", false, true,"Hariyali Teej","હરિયાલી તીજ", false, "", false, false, "")
                    )
                    2 -> dataList.add(DataModel(isDate = true,3,"ચતુર્થી (ચોથ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    3 -> dataList.add(DataModel(isDate = true, 10, "એકાદશી (અગિયારસ) (શુ)", false, true,"Deva Shayani Ekadashi, Ashadhi Ekadashi","દેવ શયની એકાદશી, અષાઢી એકાદશી", false, "", false, false, "")
                    )
                    4 -> dataList.add(DataModel(isDate = true,17,"ચતુર્થી (ચોથ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    5 -> dataList.add(DataModel(isDate = true,24,"એકાદશી (અગિયારસ) (કૃ)",false,true,"Kamika Ekadashi","કામિકા એકાદશી",false,"",false,false,"")
                    )
                    6 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    7 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    8 -> dataList.add(DataModel(isDate = true, 4, "પંચમી (પાંચમ) (શુ)", false, false, "","", false,"", false, true, "")
                    )
                    9 -> dataList.add(DataModel(isDate = true,11,"દ્વાદશી (બારસ) (શુ)",false,true,"Pradosh Vrat (S)","પ્રદોષ વ્રત (શુક્લ)",false,"",false,false,"")
                    )
                    10 -> dataList.add(DataModel(isDate = true,18,"પંચમી (પાંચમ) (કૃ)",false,false,
                        "","",false,"",false,false,"")
                    )
                    11 -> dataList.add(DataModel(isDate = true,25,"દ્વાદશી (બારસ) (કૃ)",false,true,"Pradosh Vrat (K)","પ્રદોષ વ્રત (કૃષ્ણ)",false,"",false,false,"")
                    )
                    12 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    13 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    14 -> dataList.add(DataModel(isDate = true,5,"ષષ્ટિ (છઠ્ઠ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    15 -> dataList.add(DataModel(isDate = true,12,"ત્રયોદશી (તેરસ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    16 -> dataList.add(DataModel(isDate = true,19,"ષષ્ટિ (છઠ્ઠ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    17 -> dataList.add(DataModel(isDate = true,26,"ત્રયોદશી (તેરસ) (કૃ)",false,true,"Masik Shivaratri","માસિક શિવરાત્રિ",false,"",false,false,"")
                    )
                    18 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    19 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    20 -> dataList.add(DataModel(isDate = true,6,"સપ્તમી (સાતમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    21 -> dataList.add(DataModel(isDate = true, 13, "પૂર્ણિમા (પૂનમ)", false, true, "Guru Purnima, Ashadha Purnima Vrat", "ગુરુ પૂર્ણિમા, આષાઢ પૂર્ણિમા વ્રત",false,"", true, false, "")
                    )
                    22 -> dataList.add(DataModel(isDate = true,20,"સપ્તમી (સાતમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    23 -> dataList.add(DataModel(isDate = true,27,"ચતુર્દશી (ચૌદસ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    24 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    25 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    26 -> dataList.add(DataModel(isDate = true,7,"અષ્ટમી (આઠમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    27 -> dataList.add(DataModel(isDate = true,14,"પ્રથમા (એકમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    28 -> dataList.add(DataModel(isDate = true,21,"અષ્ટમી (આઠમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    29 -> dataList.add(DataModel(isDate = true,28,"અમાવાસ્યા (અમાસ)",true,true,"Shravana Amavasya","શ્રાવણ અમાવસ્યા",false,"",false,false,"")
                    )
                    30 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    31 -> dataList.add(DataModel(isDate = true,1,"દ્વિતિયા (બીજ) (શુ)",false,true,"Jagannath Rath Yatra","જગન્નાથ રથયાત્રા",false,"",false,false,"")
                    )
                    32 -> dataList.add(DataModel(isDate = true,8,"નવમી (નોમ) (શુ)",false,
                        false,"","",false,"",false,false,"")
                    )
                    33 -> dataList.add(DataModel(isDate = true,15,"દ્વિતિયા (બીજ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    34 -> dataList.add(DataModel(isDate = true,22,"નવમી (નોમ) (કૃ)",false,false,""         ,"",false,"",false,false,"")
                    )
                    35 -> dataList.add(DataModel(isDate = true,29,"પ્રથમા (એકમ) (શુ",false,false,"","",false,"",false,false,"")
                    )
                    36 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    37 -> dataList.add(DataModel(isDate = true,2,"તૃતીયા (ત્રીજ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    38 -> dataList.add(DataModel(isDate = true,9,"દશમી (દશમ) (શુ)",false,false,"" +
                            "","",false,"",false,false,"")
                    )
                    39 -> dataList.add(DataModel(isDate = true, 16, "તૃતીયા (ત્રીજ) (કૃ)", false, true,
                        "Sankashti Chaturthi, Karka Sankranti", "સંકષ્ટી ચતુર્થી, કર્ક સંક્રાંતિ",true, "SANG_JULY", false, false, "")
                    )
                    40 -> dataList.add(DataModel(isDate = true,23,"દશમી (દશમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    41 -> dataList.add(DataModel(isDate = true,30,"દ્વિતિયા (બીજ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                }
            }
            return dataList
        }


        fun august(): ArrayList<DataModel> {
            var dataList = ArrayList<DataModel>()
            for (i in 0..41) {
                when (i) {
                    0 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,isPanchmi = false,"")
                    )
                    1 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    2 -> dataList.add(DataModel(isDate = true,7,"દશમી (દશમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    3 -> dataList.add(DataModel(isDate = true,14,"તૃતીયા (ત્રીજ) (કૃ)",false,true,"Kajari Teej","કજરી તીજ",false,"",false,false,"")
                    )
                    4 -> dataList.add(DataModel(isDate = true,21,"દશમી (દશમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    5 -> dataList.add(DataModel(isDate = true,28,"પ્રથમા (એકમ) (શુ)",false,false,"" ,"",false,"",false,false,"",)
                    )
                    6 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    7 -> dataList.add(DataModel(isDate = true,1,"ચતુર્થી (ચોથ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    8 -> dataList.add(DataModel(isDate = true,8,"એકાદશી (અગિયારસ) (શુ)",false,true,"Shravana Putrada Ekadashi","શ્રાવણ પુત્રદા એકાદશી",false,"",false,false,"")
                    )
                    9 -> dataList.add(DataModel(isDate = true, 15, "ચતુર્થી (ચોથ) (કૃ)", false, true, "Sankashti Chaturthi" ,"સંકષ્ટી ચતુર્થી", false, "", false, false, "")
                    )
                    10 -> dataList.add(DataModel(isDate = true,22,"એકાદશી (અગિયારસ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    11 -> dataList.add(DataModel(isDate = true, 29, "દ્વિતિયા (બીજ) (શુ)", false, true, "" , "",false, "", false, false, "")
                    )
                    12 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    13 -> dataList.add(DataModel(isDate = true, 2, "પંચમી (પાંચમ) (શુ)", false, true, "Nag Panchami","નાગ પંચમી",false, "", false, true, "")
                    )
                    14 -> dataList.add(DataModel(isDate = true, 9, "દ્વાદશી (બારસ) (શુ)", false, false, "Pradosh Vrat (S)"         , "પ્રદોષ વ્રત (શુક્લ)",false, "", false, false, "")
                    )
                    15 -> dataList.add(DataModel(isDate = true,16,"પંચમી (પાંચમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    16 -> dataList.add(DataModel(isDate = true,23,"એકાદશી (અગિયારસ) (કૃ)",false,true,"Aja Ekadashi","અજા એકાદશી",false,"",false,false,"")
                    )
                    17 -> dataList.add(DataModel(isDate = true, 30, "તૃતીયા (ત્રીજ) (શુ)", false, true, "Hartalika Teej","હરતાલિકા તીજ", false, "", false, false, "")
                    )
                    18 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    19 -> dataList.add(DataModel(isDate = true,3,"પંચમી (પાંચમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    20 -> dataList.add(DataModel(isDate = true,10,"ત્રયોદશી (તેરસ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    21 -> dataList.add(DataModel(isDate = true, 17, "ષષ્ટિ (છઠ્ઠ) (કૃ)", false, true,"Simha Sankranti","સિંહ સંક્રાંતિ",
                        true, SANG_AUG, false, false, "")
                    )
                    22 -> dataList.add(DataModel(isDate = true,24,"દ્વાદશી (બારસ) (કૃ)",false,true,"Pradosh Vrat (K)","પ્રદોષ વ્રત (કૃષ્ણ)",false,"",false,false,"")
                    )
                    23 -> dataList.add(DataModel(isDate = true,31,"ચતુર્થી (ચોથ) (શુ)",false,true,"Ganesh Chaturthi","ગણેશ ચતુર્થી",false,"",false,false,"")
                    )
                    24 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    25 -> dataList.add(DataModel(isDate = true,4,"સપ્તમી (સાતમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    26 -> dataList.add(DataModel(isDate = true,11,"ચતુર્દશી (ચૌદસ) (શુ)",false,true,"Raksha Bandhan","રક્ષા બંધન",false,"",false,false,"")
                    )
                    27 -> dataList.add(DataModel(isDate = true,18,"સપ્તમી (સાતમ) (કૃ)ਂ",false,false,"","",false,"",false,false,"")
                    )
                    28 -> dataList.add(DataModel(isDate = true,25,"ત્રયોદશી (તેરસ) (કૃ)",false,true,"Masik Shivaratri","માસિક શિવરાત્રિ",false,"",false,false,"")
                    )
                    29 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    30 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    31 -> dataList.add(DataModel(isDate = true,5,"અષ્ટમી (આઠમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    32 -> dataList.add(DataModel(isDate = true, 12, "પૂર્ણિમા (પૂનમ)", false, true, "Shravana Purnima Vrat" , "શ્રાવણ પૂર્ણિમા વ્રત",false, "", true, false, "")
                    )
                    33 -> dataList.add(DataModel(isDate = true, 19, "અષ્ટમી (આઠમ) (કૃ)", false, true, "Janmashtami" , "કૃષ્ણ જન્માષ્ટમી",false, "", false, false, "")
                    )
                    34 -> dataList.add(DataModel(isDate = true,26,"ચતુર્દશી (ચૌદસ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    35 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    36 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    37 -> dataList.add(DataModel(isDate = true,6,"નવમી (નોમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    38 -> dataList.add(DataModel(isDate = true,13,"દ્વિતિયા (બીજ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    39 -> dataList.add(DataModel(isDate = true,20,"નવમી (નોમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    40 -> dataList.add(DataModel(isDate = true,27,"અમાવાસ્યા (અમાસ)",true,true,"Bhadrapada Amavasya","ભાદ્રપદ અમાવસ્યા",false,"",false,false,"")
                    )
                    41 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                }
            }
            return dataList
        }

        fun sept(): ArrayList<DataModel> {
            var dataList = ArrayList<DataModel>()
            for (i in 0..41) {
                when (i) {
                    0 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,isPanchmi = false,"")
                    )
                    1 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    2 -> dataList.add(DataModel(isDate = true,4,"અષ્ટમી (આઠમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    3 -> dataList.add(DataModel(isDate = true,11,"પ્રથમા (એકમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    4 -> dataList.add(DataModel(isDate = true,18,"અષ્ટમી (આઠમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    5 -> dataList.add(DataModel(isDate = true, 25, "અમાવાસ્યા (અમાસ)", true, true, "Ashwin Amavasya" , "અશ્વિન અમાવસ્યા",false, "", false, false, "")
                    )
                    6 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    7 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    8 -> dataList.add(DataModel(isDate = true, 5, "નવમી (નોમ) (શુ)", false, true,"", "",false, "", false, false, "")
                    )
                    9 -> dataList.add(DataModel(isDate = true,12,"દ્વિતિયા (બીજ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    10 -> dataList.add(DataModel(isDate = true,19,"નવમી (નોમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    11 -> dataList.add(DataModel(isDate = true, 26, "પ્રથમા (એકમ) (શુ)", false, true, "Sharad Navratri, Ghatasthapana" ,"શરદ નવરાત્રિ, ઘટસ્થાપના", false, "", false, false, "")
                    )
                    12 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    13 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    14 -> dataList.add(DataModel(isDate = true,6,"એકાદશી (અગિયારસ) (શુ)",false,true,"Parivartini Ekadashi","પરિવર્તિની એકાદશી",false,"",false,false,"")
                    )
                    15 -> dataList.add(DataModel(isDate = true,13,"તૃતીયા (ત્રીજ) (કૃ)",false,true,"Sankashti Chaturthi","સંકષ્ટી ચતુર્થી",false,"",false,false,"")
                    )
                    16 -> dataList.add(DataModel(isDate = true, 20, "દશમી (દશમ) (કૃ)", false, false, "" ,"", false, "", false, false, "")
                    )
                    17 -> dataList.add(DataModel(isDate = true,27,"દ્વિતિયા (બીજ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    18 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    19 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    20 -> dataList.add(DataModel(isDate = true,7,"દ્વાદશી (બારસ) (શુ)",false,true,"","ઈન્દિરા એકાદશી",false,"",false,false,"")
                    )
                    21 -> dataList.add(DataModel(isDate = true,14,"ચતુર્થી (ચોથ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    22 -> dataList.add(DataModel(isDate = true,21,"એકાદશી (અગિયારસ) (કૃ)",false,false,"Indira Ekadashi","",false,"",false,false,"")
                    )
                    23 -> dataList.add(DataModel(isDate = true, 28, "તૃતીયા (ત્રીજ) (શુ)", false, true, "" ,"", false, "", false, false, "")
                    )
                    24 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    25 -> dataList.add(DataModel(isDate = true, 1, "પંચમી (પાંચમ) (શુ)", false, false, "","", false,"", false, true, "")
                    )
                    26 -> dataList.add(DataModel(isDate = true, 8, "ત્રયોદશી (તેરસ) (શુ)ਂ", false, true,"Pradosh Vrat (S), Onam/Thiruvonam", "પ્રદોષ વ્રત (શુક્લ), ઓણમ/થિરુવોણમ",false, "", false, false, "")
                    )
                    27 -> dataList.add(DataModel(isDate = true, 15, "પંચમી (પાંચમ) (કૃ)", false, true,"", "",false, "", false, false, "")
                    )
                    28 -> dataList.add(DataModel(isDate = true,22,"દ્વાદશી (બારસ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    29 -> dataList.add(DataModel(isDate = true,29,"ચતુર્થી (ચોથ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    30 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    31 -> dataList.add(DataModel(isDate = true,2,"ષષ્ટિ (છઠ્ઠ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    32 -> dataList.add(DataModel(isDate = true,9,"ચતુર્દશી (ચૌદસ) (શુ)",false,true,"Anant Chaturdashi","અંનત ચતુર્દશી",false,"",false,false,"")
                    )
                    33 -> dataList.add(DataModel(isDate = true,16,"ષષ્ટિ (છઠ્ઠ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    34 -> dataList.add(DataModel(isDate = true,23,"ત્રયોદશી (તેરસ) (કૃ)",false,true,"Pradosh Vrat (K)","પ્રદોષ વ્રત (કૃષ્ણ)",false,"",false,false,"")
                    )
                    35 -> dataList.add(DataModel(isDate = true, 30, "પંચમી (પાંચમ) (શુ)", false, false, "","",false, "", false, true, "")
                    )
                    36 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    37 -> dataList.add(DataModel(isDate = true, 3, "સપ્તમી (સાતમ) (શુ)", false, false, "" , "",false, "", false, false, "")
                    )
                    38 -> dataList.add(DataModel(isDate = true,10,"પૂર્ણિમા (પૂનમ)",false,true,"Bhadrapada Purnima Vrat" ,  "ભાદ્રપદ પૂર્ણિમા વ્રત",false,"",true,false,"")
                    )
                    39 -> dataList.add(DataModel(isDate = true,17,"સપ્તમી (સાતમ) (કૃ)",false,true,"Kanya Sankranti","કન્યા સંક્રાતિં",
                        true, SANG_SEPT,false,false,"")
                    )
                    40 -> dataList.add(DataModel(isDate = true,24,"ચતુર્દશી (ચૌદસ) (કૃ)",false,true,"Masik Shivaratri","માસિક શિવરાત્રિ",false,"",false,false,"")
                    )
                    41 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                }
            }
            return dataList
        }
        fun oct(): ArrayList<DataModel> {
            var dataList = ArrayList<DataModel>()
            for (i in 0..41) {
                when (i) {
                    0 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,isPanchmi = false,"")
                    )
                    1 -> dataList.add(DataModel(isDate = true,30,"ષષ્ટિ (છઠ્ઠ) (શુ)",false,true,"Chhath Puja","છઠ પૂજા",false,"",false,false,"")
                    )
                    2 -> dataList.add(DataModel(isDate = true, 2, "સપ્તમી (સાતમ) (શુ)", false, true, "Navpatrika Puja" , "નવપત્રિકા પૂજા",false, "", false, false, "")
                    )
                    3 -> dataList.add(DataModel(isDate = true,9,"પૂર્ણિમા (પૂનમ)",false,true,"Ashwin Purnima Vrat" ,"અશ્વિન પૂર્ણિમા વ્રત",false,"",true,false,"")
                    )
                    4 -> dataList.add(DataModel(isDate = true,16,"ષષ્ટિ (છઠ્ઠ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    5 -> dataList.add(DataModel(isDate = true,23,"ત્રયોદશી (તેરસ) (કૃ)",false,true,"Masik Shivaratri, Dhanteras"        ,"માસિક શિવરાત્રિ, ધનતેરસ",false,"",false,false,"")
                    )
                    6 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    7 -> dataList.add(DataModel(isDate = true,31,"સપ્તમી (સાતમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    8 -> dataList.add(DataModel(isDate = true, 3, "અષ્ટમી (આઠમ) (શુ)", false, true, "Durga Puja Ashtami" , "દુર્ગા પૂજા અષ્ટમી પૂજા",false, "", false, false, "")
                    )
                    9 -> dataList.add(DataModel(isDate = true,10,"પ્રથમા (એકમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    10 -> dataList.add(DataModel(isDate = true,17,"સપ્તમી (સાતમ) (કૃ)",false,true,"Tula Sankranti",
                        "તુલા સંક્રાંતિ",true, SANG_OCT,false,false,"")
                    )
                    11 -> dataList.add(DataModel(isDate = true, 24, "ચતુર્દશી (ચૌદસ) (કૃ)", false, true, "Diwali, Narak Chaturdashi" ,"દિવાળી, નરક ચતુદર્શી", false, "", false, false, "")
                    )
                    12 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    13 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    14 -> dataList.add(DataModel(isDate = true, 4, "નવમી (નોમ) (શુ)", false, true, "Durga Maha Navami Puja, Sharad Navratri Parana" , "દુર્ગા મહા નવમી પૂજા, શરદ નવરાત્રિ પારણા",false,"", "", false, false, "")
                    )
                    15 -> dataList.add(DataModel(isDate = true, 11, "દ્વિતિયા (બીજ) (કૃ)", false, false, "" , "",false, "", false, false, "")
                    )
                    16 -> dataList.add(DataModel(isDate = true,18,"અષ્ટમી (આઠમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    17 -> dataList.add(DataModel(isDate = true, 25, "અમાવાસ્યા (અમાસ)", true, true, "Kartik Amavasya" , "કાર્તિક અમાવસ્યા",false, "", false, false, "")
                    )
                    18 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    19 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    20 -> dataList.add(DataModel(isDate = true, 5, "દશમી (દશમ) (શુ)", false, true, "Durga Visarjan, Dussehra" , "દુર્ગા વિસર્જન, દશેરા",false, "", false, false, "")
                    )
                    21 -> dataList.add(DataModel(isDate = true,12,"તૃતીયા (ત્રીજ) (કૃ)",false,false,"",
                        "",false,"",false,false,"",)
                    )
                    22 -> dataList.add(DataModel(isDate = true,19,"નવમી (નોમ) (કૃ)",false,false,"", "",false,"",false,false,"")
                    )
                    23 -> dataList.add(DataModel(isDate = true, 26, "પ્રથમા (એકમ) (શુ)", false, true, "Bhai Dooj, Govardhan Puja" , "ભાઈ દૂજ, ગોવર્ધન પૂજા",false, "", false, false, "")
                    )
                    24 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    25 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    26 -> dataList.add(DataModel(isDate = true,6,"એકાદશી (અગિયારસ) (શુ)",false,true,"Papankusha Ekadashi","પાશાંકુશ એકાદશી",false,"",false,false,"")
                    )
                    27 -> dataList.add(DataModel(isDate = true,13,"ચતુર્થી (ચોથ) (કૃ)",false,true,"Sankashti Chaturthi, Karva Chauth","સંકષ્ટી ચતુર્થી, કરવા ચૌથ",false,"",false,false,"")
                    )
                    28 -> dataList.add(DataModel(isDate = true,20,"દશમી (દશમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    29 -> dataList.add(DataModel(isDate = true,27,"દ્વિતિયા (બીજ) (શુ)",false,false,"" ,"",false,"",false,false,"")
                    )
                    30 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    31 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    32 -> dataList.add(DataModel(isDate = true, 7, "દ્વાદશી (બારસ) (શુ)", false, true, "Pradosh Vrat (S)" , "પ્રદોષ વ્રત (શુક્લ)",false, "", false, true, "")
                    )
                    33 -> dataList.add(DataModel(isDate = true,14,"પંચમી (પાંચમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    34 -> dataList.add(DataModel(isDate = true,21,"એકાદશી (અગિયારસ) (કૃ)",false,true,"Rama Ekadashi","રમા એકાદશી",false,"",false,false,"")
                    )
                    35 -> dataList.add(DataModel(isDate = true,28,"તૃતીયા (ત્રીજ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    36 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    37 -> dataList.add(DataModel(isDate = true,1,"ષષ્ટિ (છઠ્ઠ) (શુ)",false,false,"Kalparambha","કલ્પઆરંભ",false,"",false,false,"")
                    )
                    38 -> dataList.add(DataModel(isDate = true, 8, "ચતુર્દશી (ચૌદસ) (શુ)", false, false, "" "",false, "", false, false, "")
                    )
                    39 -> dataList.add(DataModel(isDate = true,15,"ષષ્ટિ (છઠ્ઠ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    40 -> dataList.add(DataModel(isDate = true,22,"દ્વાદશી (બારસ) (કૃ)",false,true,"Pradosh Vrat (K)","પ્રદોષ વ્રત (કૃષ્ણ)",false,"",false,false,"")
                    )
                    41 -> dataList.add(DataModel(isDate = true, 29, "ચતુર્થી (ચોથ) (શુ)", false, true,"", "",false, "", false, true, "")
                    )
                }
            }
            return dataList
        }


        fun nov(): ArrayList<DataModel> {
            var dataList = ArrayList<DataModel>()
            for (i in 0..41) {
                when (i) {
                    0 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,isPanchmi = false,"")
                    )
                    1 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    2 -> dataList.add(DataModel(isDate = true,6,"ત્રયોદશી (તેરસ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    3 -> dataList.add(DataModel(isDate = true,13,"પંચમી (પાંચમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    4 -> dataList.add(DataModel(isDate = true,20,"એકાદશી (અગિયારસ) (કૃ)",false,true,"Utpanna Ekadashi","ઉત્પન્ના એકાદશી",false,"",false,false,"")
                    )
                    5 -> dataList.add(DataModel(isDate = true,27,"ચતુર્થી (ચોથ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    6 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    7 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    8 -> dataList.add(DataModel(isDate = true,7,"ચતુર્દશી (ચૌદસ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    9 -> dataList.add(DataModel(isDate = true,14,"ષષ્ટિ (છઠ્ઠ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    10 -> dataList.add(DataModel(isDate = true,21,"દ્વાદશી (બારસ) (કૃ)",false,true,"Pradosh Vrat (K)","પ્રદોષ વ્રત (કૃષ્ણ)",false,"",false,false,"")
                    )
                    11 -> dataList.add(DataModel(isDate = true,28,"પંચમી (પાંચમ) (શુ)",false,false," ","",false,"",false,true,"")
                    )
                    12 -> dataList.add(DataModel(isDate = false,-1,"",false,true,"","માસિક શિવરાત્રિ",false,"",false,false,"")
                    )
                    13 -> dataList.add(DataModel(isDate = true, 1, "અષ્ટમી (આઠમ) (શુ)", false, true, "" ,"",false, "", false, false, "")
                    )
                    14 -> dataList.add(DataModel(isDate = true,8,"પૂર્ણિમા (પૂનમ)",false,true,"Kartik Purnima Vrat" ,"કાર્તિક પૂર્ણિમા વ્રત",false,"",true,false,"")
                    )
                    15 -> dataList.add(DataModel(isDate = true, 15, "સપ્તમી (સાતમ) (કૃ)", false, false, "" , "",false, "", false, false, "")
                    )
                    16 -> dataList.add(DataModel(isDate = true,22,"ત્રયોદશી (તેરસ) (કૃ)",false,false,"Masik Shivaratri","",false,"",false,false,"")
                    )
                    17 -> dataList.add(DataModel(isDate = true,29,"ષષ્ટિ (છઠ્ઠ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    18 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    19 -> dataList.add(DataModel(isDate = true,2,"નવમી (નોમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    20 -> dataList.add(DataModel(isDate = true,9,"પ્રથમા (એકમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    21 -> dataList.add(DataModel(isDate = true,16,"અષ્ટમી (આઠમ) (કૃ)",false,true,"Vrischika Sankranti",
                        "વૃશ્ચિક સંક્રાંતિ",true, SANG_NOV,false,false,"")
                    )
                    22 -> dataList.add(DataModel(isDate = true,23,"ચતુર્દશી (ચૌદસ) (કૃ)",true,true,"Margashirsha Amavasya","માર્ગશીર્ષ અમાવસ્યા",false,"",false,false,"")
                    )
                    23 -> dataList.add(DataModel(isDate = true,30,"સપ્તમી (સાતમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    24 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    25 -> dataList.add(DataModel(isDate = true,3,"દશમી (દશમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    26 -> dataList.add(DataModel(isDate = true,10,"દ્વિતિયા (બીજ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    27 -> dataList.add(DataModel(isDate = true, 17, "અષ્ટમી (આઠમ) (કૃ)", false, true, "" +        "ਸ਼ਹੀਦੀ ਲਾਲਾ ਲਾਜਪਤ ਰਾਏ","", false, "", false, false, "")
                    )
                    28 -> dataList.add(DataModel(isDate = true,24,"પ્રથમા (એકમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    29 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    30 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    31 -> dataList.add(DataModel(isDate = true, 4, "એકાદશી (અગિયારસ) (શુ)", false, true, "Devutthana Ekadashi" ,"દેવઉથ્થન એકાદશી", false, "", false, false, "")
                    )
                    32 -> dataList.add(DataModel(isDate = true,11,"તૃતીયા (ત્રીજ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    33 -> dataList.add(DataModel(isDate = true,18,"નવમી (નોમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    34 -> dataList.add(DataModel(isDate = true,25,"દ્વિતિયા (બીજ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    35 -> dataList.add(DataModel(isDate = false, -1, "", false, false,
                        "" , "",false, "", false, false, "")
                    )
                    36 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    37 -> dataList.add(DataModel(isDate = true,5,"દ્વાદશી (બારસ) (શુ)",false,true,"Pradosh Vrat (S)","પ્રદોષ વ્રત (શુક્લ)",false,"",false,false,"")
                    )
                    38 -> dataList.add(DataModel(isDate = true,12,"ચતુર્થી (ચોથ) (કૃ)",false,true,"Sankashti Chaturthi","સંકષ્ટી ચતુર્થી",false,"",false,false,"")
                    )
                    39 -> dataList.add(DataModel(isDate = true,19,"દશમી (દશમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    40 -> dataList.add(DataModel(isDate = true, 26, "તૃતીયા (ત્રીજ) (શુ)", false, false, "" ,"", false, "", false, false, "")
                    )
                    41 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                }
            }
            return dataList
        }

        fun dec(): ArrayList<DataModel> {
            var dataList = ArrayList<DataModel>()
            for (i in 0..41) {
                when (i) {
                    0 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,isPanchmi = false,"")
                    )
                    1 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    2 -> dataList.add(DataModel(isDate = true,4,"દ્વાદશી (બારસ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    3 -> dataList.add(DataModel(isDate = true,11,"તૃતીયા (ત્રીજ) (કૃ)",false,true,"Sankashti Chaturthi","સંકષ્ટી ચતુર્થી",false,"",false,false,"")
                    )
                    4 -> dataList.add(DataModel(isDate = true,18,"દશમી (દશમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    5 -> dataList.add(DataModel(isDate = true, 25, "દ્વિતિયા (બીજ) (શુ)", false, true, "", "",false, "", false, false, "")
                    )
                    6 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    7 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    8 -> dataList.add(DataModel(isDate = true,5,"ત્રયોદશી (તેરસ) (શુ)",false,true,"Pradosh Vrat (S)","પ્રદોષ વ્રત (શુક્લ)",false,"",false,false,"")
                    )
                    9 -> dataList.add(DataModel(isDate = true,12,"ચતુર્થી (ચોથ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    10 -> dataList.add(DataModel(isDate = true,19,"એકાદશી (અગિયારસ) (કૃ)",false,true,"Saphala Ekadashi","સફલા એકાદશી",false,"",false,false,"")
                    )
                    11 -> dataList.add(DataModel(isDate = true,26,"ચતુર્થી (ચોથ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    12 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    13 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    14 -> dataList.add(DataModel(isDate = true,6,"ચતુર્દશી (ચૌદસ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    15 -> dataList.add(DataModel(isDate = true,13,"પંચમી (પાંચમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    16 -> dataList.add(DataModel(isDate = true,20,"દ્વાદશી (બારસ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    17 -> dataList.add(DataModel(isDate = true, 27, "પંચમી (પાંચમ) (શુ)", false, false, "","",false, "", false, true, "")
                    )
                    18 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    19 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    20 -> dataList.add(DataModel(isDate = true,7,"ચતુર્દશી (ચૌદસ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    21 -> dataList.add(DataModel(isDate = true,14,"ષષ્ટિ (છઠ્ઠ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    22 -> dataList.add(DataModel(isDate = true,21,"ત્રયોદશી (તેરસ) (કૃ)",false,true,"Pradosh Vrat (K), Masik Shivaratri","પ્રદોષ વ્રત (કૃષ્ણ), માસિક શિવરાત્રિ",false,"",false,false,"")
                    )
                    23 -> dataList.add(DataModel(isDate = true, 28, "ષષ્ટિ (છઠ્ઠ) (શુ)", false, false, "" ,"", false, "", false, false, "")
                    )
                    24 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    25 -> dataList.add(DataModel(isDate = true,1,"અષ્ટમી (આઠમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    26 -> dataList.add(DataModel(isDate = true, 8, "પૂર્ણિમા (પૂનમ)", false, true, "Margashirsha Purnima Vrat", "માર્ગશીર્ષ પૂર્ણિમા વ્રત",false,"", true, false, "")
                    )
                    27 -> dataList.add(DataModel(isDate = true,15,"સપ્તમી (સાતમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    28 -> dataList.add(DataModel(isDate = true,22,"ચતુર્દશી (ચૌદસ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    29 -> dataList.add(DataModel(isDate = true, 29, "સપ્તમી (સાતમ) (શુ)", false, false, "" , "",false, "", false, false, "")
                    )
                    30 -> dataList.add(DataModel(isDate = false,-1,"",false,false,"","",false,"",false,false,"")
                    )
                    31 -> dataList.add(DataModel(isDate = true,2,"દશમી (દશમ) (શુ)",false,true,"","પોષ અમાવસ્યા",false,"",false,false,"")
                    )
                    32 -> dataList.add(DataModel(isDate = true,9,"પ્રથમા (એકમ) (કૃ)",false,false,"","",
                        false,"",false,false,"")
                    )
                    33 -> dataList.add(DataModel(isDate = true, 16, "અષ્ટમી (આઠમ) (કૃ)", false, true, "Dhanu Sankranti","ધનુ સંક્રાંતિ", true,SANG_DEC, false, false, "")
                    )
                    34 -> dataList.add(DataModel(isDate = true, 23, "અમાવાસ્યા (અમાસ)", true, false, "Paush Amavasya" ,"", false, "", false, false, "")
                    )
                    35 -> dataList.add(DataModel(isDate = true,30,"અષ્ટમી (આઠમ) (શુ)",false,false,"","",false,"",""",false,false,"")
                    )
                    36 -> dataList.add(DataModel(isDate = false,-1,"",false,   false,"","",false,false,false,"")
                    )
                    37 -> dataList.add(DataModel(isDate = true,3,"એકાદશી (અગિયારસ) (શુ)",false,true,"Mokshada Ekadashi","મોક્ષદા એકાદશી",false,"",false,false,"")
                    )
                    38 -> dataList.add(DataModel(isDate = true,10,"નવમી (નોમ) (કૃ)",false,false,"","",false,"",false,false,"")
                    )
                    39 -> dataList.add(DataModel(isDate = true,17,"પ્રથમા (એકમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                    40 -> dataList.add(DataModel(isDate = true,24,"9 ਪੋਹ",false,false,"","",false,"",false,false,"")
                    )
                    41 -> dataList.add(DataModel(isDate = true,31,"નવમી (નોમ) (શુ)",false,false,"","",false,"",false,false,"")
                    )
                }
            }
            return dataList
        }


        var SANG_JAN = "ਮਾਘਿ ਮਜਨੁ ਸੰਗਿ ਸਾਧੂਆ ਧੂੜੀ ਕਰਿ ਇਸਨਾਨੁ ॥\n" +
                "ਹਰਿ ਕਾ ਨਾਮੁ ਧਿਆਇ ਸੁਣਿ ਸਭਨਾ ਨੋ ਕਰਿ ਦਾਨੁ ॥\n" +
                "ਜਨਮ ਕਰਮ ਮਲੁ ਉਤਰੈ ਮਨ ਤੇ ਜਾਇ ਗੁਮਾਨੁ ॥\n" +
                "ਕਾਮਿ ਕਰੋਧਿ ਨ ਮੋਹੀਐ ਬਿਨਸੈ ਲੋਭੁ ਸੁਆਨੁ ॥\n" +
                "ਸਚੈ ਮਾਰਗਿ ਚਲਦਿਆ ਉਸਤਤਿ ਕਰੇ ਜਹਾਨੁ ॥\n" +
                "ਅਠਸਠਿ ਤੀਰਥ ਸਗਲ ਪੁੰਨ ਜੀਅ ਦਇਆ ਪਰਵਾਨੁ ॥\n" +
                "ਜਿਸ ਨੋ ਦੇਵੈ ਦਇਆ ਕਰਿ ਸੋਈ ਪੁਰਖੁ ਸੁਜਾਨੁ ॥\n" +
                "ਜਿਨਾ ਮਿਲਿਆ ਪ੍ਰਭੁ ਆਪਣਾ ਨਾਨਕ ਤਿਨ ਕੁਰਬਾਨੁ ॥\n" +
                "ਮਾਘਿ ਸੁਚੇ ਸੇ ਕਾਂਢੀਅਹਿ ਜਿਨ ਪੂਰਾ ਗੁਰੁ ਮਿਹਰਵਾਨੁ ॥੧੨॥"


        var SANG_FEB = "ਫਲਗੁਣਿ ਅਨੰਦ ਉਪਾਰਜਨਾ ਹਰਿ ਸਜਣ ਪ੍ਰਗਟੇ ਆਇ ॥\n" +
                "ਸੰਤ ਸਹਾਈ ਰਾਮ ਕੇ ਕਰਿ ਕਿਰਪਾ ਦੀਆ ਮਿਲਾਇ ॥\n" +
                "ਸੇਜ ਸੁਹਾਵੀ ਸਰਬ ਸੁਖ ਹੁਣਿ ਦੁਖਾ ਨਾਹੀ ਜਾਇ ॥\n" +
                "ਇਛ ਪੁਨੀ ਵਡਭਾਗਣੀ ਵਰੁ ਪਾਇਆ ਹਰਿ ਰਾਇ ॥\n" +
                "ਮਿਲਿ ਸਹੀਆ ਮੰਗਲੁ ਗਾਵਹੀ ਗੀਤ ਗੋਵਿੰਦ ਅਲਾਇ ॥\n" +
                "ਹਰਿ ਜੇਹਾ ਅਵਰੁ ਨ ਦਿਸਈ ਕੋਈ ਦੂਜਾ ਲਵੈ ਨ ਲਾਇ ॥\n" +
                "ਹਲਤੁ ਪਲਤੁ ਸਵਾਰਿਓਨੁ ਨਿਹਚਲ ਦਿਤੀਅਨੁ ਜਾਇ ॥\n" +
                "ਸੰਸਾਰ ਸਾਗਰ ਤੇ ਰਖਿਅਨੁ ਬਹੁੜਿ ਨ ਜਨਮੈ ਧਾਇ ॥\n" +
                "ਜਿਹਵਾ ਏਕ ਅਨੇਕ ਗੁਣ ਤਰੇ ਨਾਨਕ ਚਰਣੀ ਪਾਇ ॥\n" +
                "ਫਲਗੁਣਿ ਨਿਤ ਸਲਾਹੀਐ ਜਿਸ ਨੋ ਤਿਲੁ ਨ ਤਮਾਇ ॥੧੩॥"

        var SANG_MAR = "ਚੇਤਿ ਗੋਵਿੰਦੁ ਅਰਾਧੀਐ ਹੋਵੈ ਅਨੰਦੁ ਘਣਾ ॥\n" +
                "ਸੰਤ ਜਨਾ ਮਿਲਿ ਪਾਈਐ ਰਸਨਾ ਨਾਮੁ ਭਣਾ ॥\n" +
                "ਜਿਨਿ ਪਾਇਆ ਪ੍ਰਭੁ ਆਪਣਾ ਆਏ ਤਿਸਹਿ ਗਣਾ ॥\n" +
                "ਇਕੁ ਖਿਨੁ ਤਿਸੁ ਬਿਨੁ ਜੀਵਣਾ ਬਿਰਥਾ ਜਨਮੁ ਜਣਾ ॥\n" +
                "ਜਲਿ ਥਲਿ ਮਹੀਅਲਿ ਪੂਰਿਆ ਰਵਿਆ ਵਿਚਿ ਵਣਾ ॥\n" +
                "ਸੋ ਪ੍ਰਭੁ ਚਿਤਿ ਨ ਆਵਈ ਕਿਤੜਾ ਦੁਖੁ ਗਣਾ ॥\n" +
                "ਜਿਨੀ ਰਾਵਿਆ ਸੋ ਪ੍ਰਭੂ ਤਿੰਨਾ ਭਾਗੁ ਮਣਾ ॥\n" +
                "ਹਰਿ ਦਰਸਨ ਕੰਉ ਮਨੁ ਲੋਚਦਾ ਨਾਨਕ ਪਿਆਸ ਮਨਾ ॥\n" +
                "ਚੇਤਿ ਮਿਲਾਏ ਸੋ ਪ੍ਰਭੂ ਤਿਸ ਕੈ ਪਾਇ ਲਗਾ ॥੨॥"
        var SANG_APR = "ਵੈਸਾਖਿ ਧੀਰਨਿ ਕਿਉ ਵਾਢੀਆ ਜਿਨਾ ਪ੍ਰੇਮ ਬਿਛੋਹੁ ॥\n" +
                "ਹਰਿ ਸਾਜਨੁ ਪੁਰਖੁ ਵਿਸਾਰਿ ਕੈ ਲਗੀ ਮਾਇਆ ਧੋਹੁ ॥\n" +
                "ਪੁਤ੍ਰ ਕਲਤ੍ਰ ਨ ਸੰਗਿ ਧਨਾ ਹਰਿ ਅਵਿਨਾਸੀ ਓਹੁ ॥\n" +
                "ਪਲਚਿ ਪਲਚਿ ਸਗਲੀ ਮੁਈ ਝੂਠੈ ਧੰਧੈ ਮੋਹੁ ॥\n" +
                "ਇਕਸੁ ਹਰਿ ਕੇ ਨਾਮ ਬਿਨੁ ਅਗੈ ਲਈਅਹਿ ਖੋਹਿ ॥\n" +
                "ਦਯੁ ਵਿਸਾਰਿ ਵਿਗੁਚਣਾ ਪ੍ਰਭ ਬਿਨੁ ਅਵਰੁ ਨ ਕੋਇ ॥\n" +
                "ਪ੍ਰੀਤਮ ਚਰਣੀ ਜੋ ਲਗੇ ਤਿਨ ਕੀ ਨਿਰਮਲ ਸੋਇ ॥\n" +
                "ਨਾਨਕ ਕੀ ਪ੍ਰਭ ਬੇਨਤੀ ਪ੍ਰਭ ਮਿਲਹੁ ਪਰਾਪਤਿ ਹੋਇ ॥\n" +
                "ਵੈਸਾਖੁ ਸੁਹਾਵਾ ਤਾਂ ਲਗੈ ਜਾ ਸੰਤੁ ਭੇਟੈ ਹਰਿ ਸੋਇ ॥੩॥"
        var SANG_MAY = "ਹਰਿ ਜੇਠਿ ਜੁੜੰਦਾ ਲੋੜੀਐ ਜਿਸੁ ਅਗੈ ਸਭਿ ਨਿਵੰਨਿ ॥\n" +
                "ਹਰਿ ਸਜਣ ਦਾਵਣਿ ਲਗਿਆ ਕਿਸੈ ਨ ਦੇਈ ਬੰਨਿ ॥\n" +
                "ਮਾਣਕ ਮੋਤੀ ਨਾਮੁ ਪ੍ਰਭ ਉਨ ਲਗੈ ਨਾਹੀ ਸੰਨਿ ॥\n" +
                "ਰੰਗ ਸਭੇ ਨਾਰਾਇਣੈ ਜੇਤੇ ਮਨਿ ਭਾਵੰਨਿ ॥\n" +
                "ਜੋ ਹਰਿ ਲੋੜੇ ਸੋ ਕਰੇ ਸੋਈ ਜੀਅ ਕਰੰਨਿ ॥\n" +
                "ਜੋ ਪ੍ਰਭਿ ਕੀਤੇ ਆਪਣੇ ਸੇਈ ਕਹੀਅਹਿ ਧੰਨਿ ॥\n" +
                "ਆਪਣ ਲੀਆ ਜੇ ਮਿਲੈ ਵਿਛੁੜਿ ਕਿਉ ਰੋਵੰਨਿ ॥\n" +
                "ਸਾਧੂ ਸੰਗੁ ਪਰਾਪਤੇ ਨਾਨਕ ਰੰਗ ਮਾਣੰਨਿ ॥\n" +
                "ਹਰਿ ਜੇਠੁ ਰੰਗੀਲਾ ਤਿਸੁ ਧਣੀ ਜਿਸ ਕੈ ਭਾਗੁ ਮਥੰਨਿ ॥੪॥"
        var SANG_JUNE = "ਆਸਾੜੁ ਤਪੰਦਾ ਤਿਸੁ ਲਗੈ ਹਰਿ ਨਾਹੁ ਨ ਜਿੰਨਾ ਪਾਸਿ ॥\n" +
                "ਜਗਜੀਵਨ ਪੁਰਖੁ ਤਿਆਗਿ ਕੈ ਮਾਣਸ ਸੰਦੀ ਆਸ ॥\n" +
                "ਦੁਯੈ ਭਾਇ ਵਿਗੁਚੀਐ ਗਲਿ ਪਈਸੁ ਜਮ ਕੀ ਫਾਸ ॥\n" +
                "ਜੇਹਾ ਬੀਜੈ ਸੋ ਲੁਣੈ ਮਥੈ ਜੋ ਲਿਖਿਆਸੁ ॥\n" +
                "ਰੈਣਿ ਵਿਹਾਣੀ ਪਛੁਤਾਣੀ ਉਠਿ ਚਲੀ ਗਈ ਨਿਰਾਸ ॥\n" +
                "ਜਿਨ ਕੌ ਸਾਧੂ ਭੇਟੀਐ ਸੋ ਦਰਗਹ ਹੋਇ ਖਲਾਸੁ ॥\n" +
                "ਕਰਿ ਕਿਰਪਾ ਪ੍ਰਭ ਆਪਣੀ ਤੇਰੇ ਦਰਸਨ ਹੋਇ ਪਿਆਸ ॥\n" +
                "ਪ੍ਰਭ ਤੁਧੁ ਬਿਨੁ ਦੂਜਾ ਕੋ ਨਹੀ ਨਾਨਕ ਕੀ ਅਰਦਾਸਿ ॥\n" +
                "ਆਸਾੜੁ ਸੁਹੰਦਾ ਤਿਸੁ ਲਗੈ ਜਿਸੁ ਮਨਿ ਹਰਿ ਚਰਣ ਨਿਵਾਸ ॥੫॥"
        var SANG_JULY = "ਸਾਵਣਿ ਸਰਸੀ ਕਾਮਣੀ ਚਰਨ ਕਮਲ ਸਿਉ ਪਿਆਰੁ ॥\n" +
                "ਮਨੁ ਤਨੁ ਰਤਾ ਸਚ ਰੰਗਿ ਇਕੋ ਨਾਮੁ ਅਧਾਰੁ ॥\n" +
                "ਬਿਖਿਆ ਰੰਗ ਕੂੜਾਵਿਆ ਦਿਸਨਿ ਸਭੇ ਛਾਰੁ ॥\n" +
                "ਹਰਿ ਅੰਮ੍ਰਿਤ ਬੂੰਦ ਸੁਹਾਵਣੀ ਮਿਲਿ ਸਾਧੂ ਪੀਵਣਹਾਰੁ ॥\n" +
                "ਵਣੁ ਤਿਣੁ ਪ੍ਰਭ ਸੰਗਿ ਮਉਲਿਆ ਸੰਮ੍ਰਥ ਪੁਰਖ ਅਪਾਰੁ ॥\n" +
                "ਹਰਿ ਮਿਲਣੈ ਨੋ ਮਨੁ ਲੋਚਦਾ ਕਰਮਿ ਮਿਲਾਵਣਹਾਰੁ ॥\n" +
                "ਜਿਨੀ ਸਖੀਏ ਪ੍ਰਭੁ ਪਾਇਆ ਹੰਉ ਤਿਨ ਕੈ ਸਦ ਬਲਿਹਾਰ ॥\n" +
                "ਨਾਨਕ ਹਰਿ ਜੀ ਮਇਆ ਕਰਿ ਸਬਦਿ ਸਵਾਰਣਹਾਰੁ ॥\n" +
                "ਸਾਵਣੁ ਤਿਨਾ ਸੁਹਾਗਣੀ ਜਿਨ ਰਾਮ ਨਾਮੁ ਉਰਿ ਹਾਰੁ ॥੬॥"
        var SANG_AUG = "ਭਾਦੁਇ ਭਰਮਿ ਭੁਲਾਣੀਆ ਦੂਜੈ ਲਗਾ ਹੇਤੁ ॥\n" +
                "ਲਖ ਸੀਗਾਰ ਬਣਾਇਆ ਕਾਰਜਿ ਨਾਹੀ ਕੇਤੁ ॥\n" +
                "ਜਿਤੁ ਦਿਨਿ ਦੇਹ ਬਿਨਸਸੀ ਤਿਤੁ ਵੇਲੈ ਕਹਸਨਿ ਪ੍ਰੇਤੁ ॥\n" +
                "ਪਕੜਿ ਚਲਾਇਨਿ ਦੂਤ ਜਮ ਕਿਸੈ ਨ ਦੇਨੀ ਭੇਤੁ ॥\n" +
                "ਛਡਿ ਖੜੋਤੇ ਖਿਨੈ ਮਾਹਿ ਜਿਨ ਸਿਉ ਲਗਾ ਹੇਤੁ ॥\n" +
                "ਹਥ ਮਰੋੜੈ ਤਨੁ ਕਪੇ ਸਿਆਹਹੁ ਹੋਆ ਸੇਤੁ ॥\n" +
                "ਜੇਹਾ ਬੀਜੈ ਸੋ ਲੁਣੈ ਕਰਮਾ ਸੰਦੜਾ ਖੇਤੁ ॥\n" +
                "ਨਾਨਕ ਪ੍ਰਭ ਸਰਣਾਗਤੀ ਚਰਣ ਬੋਹਿਥ ਪ੍ਰਭ ਦੇਤੁ ॥\n" +
                "ਸੇ ਭਾਦੁਇ ਨਰਕਿ ਨ ਪਾਈਅਹਿ ਗੁਰੁ ਰਖਣ ਵਾਲਾ ਹੇਤੁ ॥੭॥"
        var SANG_SEPT = "ਅਸੁਨਿ ਪ੍ਰੇਮ ਉਮਾਹੜਾ ਕਿਉ ਮਿਲੀਐ ਹਰਿ ਜਾਇ ॥\n" +
                "ਮਨਿ ਤਨਿ ਪਿਆਸ ਦਰਸਨ ਘਣੀ ਕੋਈ ਆਣਿ ਮਿਲਾਵੈ ਮਾਇ ॥\n" +
                "ਸੰਤ ਸਹਾਈ ਪ੍ਰੇਮ ਕੇ ਹਉ ਤਿਨ ਕੈ ਲਾਗਾ ਪਾਇ ॥\n" +
                "ਵਿਣੁ ਪ੍ਰਭ ਕਿਉ ਸੁਖੁ ਪਾਈਐ ਦੂਜੀ ਨਾਹੀ ਜਾਇ ॥\n" +
                "ਜਿੰਨੑੀ ਚਾਖਿਆ ਪ੍ਰੇਮ ਰਸੁ ਸੇ ਤ੍ਰਿਪਤਿ ਰਹੇ ਆਘਾਇ ॥\n" +
                "ਆਪੁ ਤਿਆਗਿ ਬਿਨਤੀ ਕਰਹਿ ਲੇਹੁ ਪ੍ਰਭੂ ਲੜਿ ਲਾਇ ॥\n" +
                "ਜੋ ਹਰਿ ਕੰਤਿ ਮਿਲਾਈਆ ਸਿ ਵਿਛੁੜਿ ਕਤਹਿ ਨ ਜਾਇ ॥\n" +
                "ਪ੍ਰਭ ਵਿਣੁ ਦੂਜਾ ਕੋ ਨਹੀ ਨਾਨਕ ਹਰਿ ਸਰਣਾਇ ॥\n" +
                "ਅਸੂ ਸੁਖੀ ਵਸੰਦੀਆ ਜਿਨਾ ਮਇਆ ਹਰਿ ਰਾਇ ॥੮॥"
        var SANG_OCT = "ਕਤਿਕਿ ਕਰਮ ਕਮਾਵਣੇ ਦੋਸੁ ਨ ਕਾਹੂ ਜੋਗੁ ॥\n" +
                "ਪਰਮੇਸਰ ਤੇ ਭੁਲਿਆਂ ਵਿਆਪਨਿ ਸਭੇ ਰੋਗ ॥\n" +
                "ਵੇਮੁਖ ਹੋਏ ਰਾਮ ਤੇ ਲਗਨਿ ਜਨਮ ਵਿਜੋਗ ॥\n" +
                "ਖਿਨ ਮਹਿ ਕਉੜੇ ਹੋਇ ਗਏ ਜਿਤੜੇ ਮਾਇਆ ਭੋਗ ॥\n" +
                "ਵਿਚੁ ਨ ਕੋਈ ਕਰਿ ਸਕੈ ਕਿਸ ਥੈ ਰੋਵਹਿ ਰੋਜ ॥\n" +
                "ਕੀਤਾ ਕਿਛੂ ਨ ਹੋਵਈ ਲਿਖਿਆ ਧੁਰਿ ਸੰਜੋਗ ॥\n" +
                "ਵਡਭਾਗੀ ਮੇਰਾ ਪ੍ਰਭੁ ਮਿਲੈ ਤਾਂ ਉਤਰਹਿ ਸਭਿ ਬਿਓਗ ॥\n" +
                "ਨਾਨਕ ਕਉ ਪ੍ਰਭ ਰਾਖਿ ਲੇਹਿ ਮੇਰੇ ਸਾਹਿਬ ਬੰਦੀ ਮੋਚ ॥\n" +
                "ਕਤਿਕ ਹੋਵੈ ਸਾਧਸੰਗੁ ਬਿਨਸਹਿ ਸਭੇ ਸੋਚ ॥੯॥"
        var SANG_NOV = "ਮੰਘਿਰਿ ਮਾਹਿ ਸੋਹੰਦੀਆ ਹਰਿ ਪਿਰ ਸੰਗਿ ਬੈਠੜੀਆਹ ॥\n" +
                "ਤਿਨ ਕੀ ਸੋਭਾ ਕਿਆ ਗਣੀ ਜਿ ਸਾਹਿਬਿ ਮੇਲੜੀਆਹ ॥\n" +
                "ਤਨੁ ਮਨੁ ਮਉਲਿਆ ਰਾਮ ਸਿਉ ਸੰਗਿ ਸਾਧ ਸਹੇਲੜੀਆਹ ॥\n" +
                "ਸਾਧ ਜਨਾ ਤੇ ਬਾਹਰੀ ਸੇ ਰਹਨਿ ਇਕੇਲੜੀਆਹ ॥\n" +
                "ਤਿਨ ਦੁਖੁ ਨ ਕਬਹੂ ਉਤਰੈ ਸੇ ਜਮ ਕੈ ਵਸਿ ਪੜੀਆਹ ॥\n" +
                "ਜਿਨੀ ਰਾਵਿਆ ਪ੍ਰਭੁ ਆਪਣਾ ਸੇ ਦਿਸਨਿ ਨਿਤ ਖੜੀਆਹ ॥\n" +
                "ਰਤਨ ਜਵੇਹਰ ਲਾਲ ਹਰਿ ਕੰਠਿ ਤਿਨਾ ਜੜੀਆਹ ॥\n" +
                "ਨਾਨਕ ਬਾਂਛੈ ਧੂੜਿ ਤਿਨ ਪ੍ਰਭ ਸਰਣੀ ਦਰਿ ਪੜੀਆਹ ॥\n" +
                "ਮੰਘਿਰਿ ਪ੍ਰਭੁ ਆਰਾਧਣਾ ਬਹੁੜਿ ਨ ਜਨਮੜੀਆਹ ॥੧੦॥"
        var SANG_DEC = "ਪੋਖਿ ਤੁਖਾਰੁ ਨ ਵਿਆਪਈ ਕੰਠਿ ਮਿਲਿਆ ਹਰਿ ਨਾਹੁ ॥\n" +
                "ਮਨੁ ਬੇਧਿਆ ਚਰਨਾਰਬਿੰਦ ਦਰਸਨਿ ਲਗੜਾ ਸਾਹੁ ॥\n" +
                "ਓਟ ਗੋਵਿੰਦ ਗੋਪਾਲ ਰਾਇ ਸੇਵਾ ਸੁਆਮੀ ਲਾਹੁ ॥\n" +
                "ਬਿਖਿਆ ਪੋਹਿ ਨ ਸਕਈ ਮਿਲਿ ਸਾਧੂ ਗੁਣ ਗਾਹੁ ॥\n" +
                "ਜਹ ਤੇ ਉਪਜੀ ਤਹ ਮਿਲੀ ਸਚੀ ਪ੍ਰੀਤਿ ਸਮਾਹੁ ॥\n" +
                "ਕਰੁ ਗਹਿ ਲੀਨੀ ਪਾਰਬ੍ਰਹਮਿ ਬਹੁੜਿ ਨ ਵਿਛੁੜੀਆਹੁ ॥\n" +
                "ਬਾਰਿ ਜਾਉ ਲਖ ਬੇਰੀਆ ਹਰਿ ਸਜਣੁ ਅਗਮ ਅਗਾਹੁ ॥\n" +
                "ਸਰਮ ਪਈ ਨਾਰਾਇਣੈ ਨਾਨਕ ਦਰਿ ਪਈਆਹੁ ॥\n" +
                "ਪੋਖੁ ਸੋੁਹੰਦਾ ਸਰਬ ਸੁਖ ਜਿਸੁ ਬਖਸੇ ਵੇਪਰਵਾਹੁ ॥੧੧॥"
    }
}
*/
