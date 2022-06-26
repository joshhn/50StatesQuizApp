package com.joshhn.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        //Q1
        val que1 = Question(
            1, "What is the name of this state?",
            R.drawable.ak,
            "Kansas","Alaska","Hawaii","Arkansas",
            2
        )

        questionsList.add(que1)

        //Q2
        val que2 = Question(
            2, "What is the name of this state?",
            R.drawable.al,
            "Alabama","Arkansas","Mississippi","Georgia",
            1
        )

        questionsList.add(que2)

        //Q3
        val que3 = Question(
            3, "What is the name of this state?",
            R.drawable.ar,
            "Arizona","Utah","New Mexico","Arkansas",
            4
        )

        questionsList.add(que3)

        //Q4
        val que4 = Question(
            4, "What is the name of this state?",
            R.drawable.az,
            "Arizona","Texas","Wyoming","Nevada",
            1
        )

        questionsList.add(que4)

        //Q5
        val que5 = Question(
            5, "What is the name of this state?",
            R.drawable.ca,
            "Nevada","Oregon","California","Hawaii",
            3
        )

        questionsList.add(que5)

        //Q6
        val que6 = Question(
            6, "What is the name of this state?",
            R.drawable.co,
            "New Mexico","Arizona","Louisiana","Colorado",
            4
        )

        questionsList.add(que6)

        //Q7
        val que7 = Question(
            7, "What is the name of this state?",
            R.drawable.ct,
            "Connecticut","New York","New Jersey","New Hampshire",
            1
        )

        questionsList.add(que7)

        //Q8
        val que8 = Question(
            8, "What is the name of this state?",
            R.drawable.de,
            "Rhode Island","Massachusetts","Pennsylvania","Delaware",
            4
        )

        questionsList.add(que8)

        //Q9
        val que9 = Question(
            9, "What is the name of this state?",
            R.drawable.fl,
            "Georgia","Florida","Hawaii","Washington",
            2
        )

        questionsList.add(que9)

        //Q10
        val que10 = Question(
            10, "What is the name of this state?",
            R.drawable.ga,
            "Louisiana","Georgia","Alabama","Arkansas",
            2
        )

        questionsList.add(que10)

        //Q11
        val que11 = Question(
            11, "What is the name of this state?",
            R.drawable.hi,
            "Wisconsin","Oregon","Hawaii","Alaska",
            3
        )

        questionsList.add(que11)

        //Q12
        val que12 = Question(
            12, "What is the name of this state?",
            R.drawable.ia,
            "Illinois","Iowa","Indiana","Ohio",
            2
        )

        questionsList.add(que12)

        //Q13
        val que13 = Question(
            13, "What is the name of this state?",
            R.drawable.id,
            "Indiana","Oregon","Tennessee","Idaho",
            4
        )

        questionsList.add(que13)

        //Q14
        val que14 = Question(
            14, "What is the name of this state?",
            R.drawable.il,
            "Iowa","Ohio","Illinois","Kentucky",
            3
        )

        questionsList.add(que14)

        //Q15
        val que15 = Question(
            15, "What is the name of this state?",
            R.drawable.`in`,
            "Indiana","Ohio","Michigan","Minnesota",
            1
        )

        questionsList.add(que15)

        //Q16
        val que16 = Question(
            16, "What is the name of this state?",
            R.drawable.ks,
            "Kansas","Alaska","Hawaii","Arkansas",
            1
        )

        questionsList.add(que16)

        //Q17
        val que17 = Question(
            17, "What is the name of this state?",
            R.drawable.ky,
            "Tennessee","Kentucky","Virginia","West Virginia",
            2
        )

        questionsList.add(que17)

        //Q18
        val que18 = Question(
            18, "What is the name of this state?",
            R.drawable.la,
            "Louisiana","Alabama","Texas","Arizona",
            1
        )

        questionsList.add(que18)

        //Q19
        val que19 = Question(
            19, "What is the name of this state?",
            R.drawable.ma,
            "Massachusetts","Pennsylvania","New York","Vermont",
            1
        )

        questionsList.add(que19)

        //Q20
        val que20 = Question(
            20, "What is the name of this state?",
            R.drawable.md,
            "Montana","Michigan","Maryland","New Jersey",
            3
        )

        questionsList.add(que20)

        //Q21
        val que21 = Question(
            21, "What is the name of this state?",
            R.drawable.me,
            "New Hampshire","Maine","Pennsylvania","Vermont",
            2
        )

        questionsList.add(que21)

        //Q22
        val que22 = Question(
            22, "What is the name of this state?",
            R.drawable.mi,
            "Michigan","Wisconsin","North Dakota","Minnesota",
            1
        )

        questionsList.add(que22)

        //Q23
        val que23 = Question(
            23, "What is the name of this state?",
            R.drawable.mn,
            "Minnesota","Wisconsin","North Dakota","Ohio",
            1
        )

        questionsList.add(que23)

        //Q24
        val que24 = Question(
            24, "What is the name of this state?",
            R.drawable.mo,
            "Montana","Missouri","Oklahoma","Mississippi",
            2
        )

        questionsList.add(que24)

        //Q25
        val que25 = Question(
            25, "What is the name of this state?",
            R.drawable.ms,
            "Mississippi","New Mexico","Nevada","Virginia",
            1
        )

        questionsList.add(que25)

        //Q26
        val que26 = Question(
            26, "What is the name of this state?",
            R.drawable.wa,
            "Washington","Oregon","Idaho","California",
            1
        )

        questionsList.add(que26)

        //Q27
        val que27 = Question(
            27, "What is the name of this state?",
            R.drawable.va,
            "West Virginia","Virginia","Ohio","Tennessee",
            2
        )

        questionsList.add(que27)

        //Q28
        val que28 = Question(
            28, "What is the name of this state?",
            R.drawable.ut,
            "Utah","New Mexico","Nevada","Wyoming",
            1
        )

        questionsList.add(que28)

        //Q29
        val que29 = Question(
            29, "What is the name of this state?",
            R.drawable.wv,
            "Washington","Virginia","West Virginia","Kentucky",
            3
        )

        questionsList.add(que29)

        //Q30
        val que30 = Question(
            30, "What is the name of this state?",
            R.drawable.wy,
            "Wyoming","Louisiana","Montana","Idaho",
            1
        )

        questionsList.add(que30)

        //Q31
        val que31 = Question(
            31, "What is the name of this state?",
            R.drawable.wi,
            "Michigan","Wisconsin","North Dakota","Iowa",
            2
        )

        questionsList.add(que31)

        //Q32
        val que32 = Question(
            32, "What is the name of this state?",
            R.drawable.vt,
            "Vermont","Maine","Pennsylvania","New Hampshire",
            1
        )

        questionsList.add(que32)

        //Q33
        val que33 = Question(
            33, "What is the name of this state?",
            R.drawable.tx,
            "Texas","Louisiana","New Mexico","Arizona",
            1
        )

        questionsList.add(que33)

        //Q34
        val que34 = Question(
            34, "What is the name of this state?",
            R.drawable.tn,
            "Kentucky","Tennessee","Ohio","Indiana",
            2
        )

        questionsList.add(que34)

        //Q35
        val que35 = Question(
            35, "What is the name of this state?",
            R.drawable.sd,
            "South Dakota","Wisconsin","Oregon","Idaho",
            1
        )

        questionsList.add(que35)

        //Q36
        val que36 = Question(
            36, "What is the name of this state?",
            R.drawable.sc,
            "North Carolina","Virginia","South Carolina","New Jersey",
            3
        )

        questionsList.add(que36)

        //Q37
        val que37 = Question(
            37, "What is the name of this state?",
            R.drawable.ri,
            "Rhode Island","Vermont","New Jersey","Maryland",
            1
        )

        questionsList.add(que37)

        //Q38
        val que38 = Question(
            38, "What is the name of this state?",
            R.drawable.pa,
            "Pennsylvania","Maine","New York","New Jersey",
            1
        )

        questionsList.add(que38)

        //Q39
        val que39 = Question(
            39, "What is the name of this state?",
            R.drawable.or,
            "California","Washington","Oregon","Minnesota",
            3
        )

        questionsList.add(que39)

        //Q40
        val que40 = Question(
            40, "What is the name of this state?",
            R.drawable.ok,
            "Kansas","Oklahoma","Arkansas","Missouri",
            2
        )

        questionsList.add(que40)

        //Q41
        val que41 = Question(
            41, "What is the name of this state?",
            R.drawable.oh,
            "Kentucky","Indiana","Ohio","Illinois",
            3
        )

        questionsList.add(que41)

        //Q42
        val que42 = Question(
            42, "What is the name of this state?",
            R.drawable.ny,
            "Pennsylvania","Massachusetts","New York","Vermont",
            3
        )

        questionsList.add(que42)

        //Q43
        val que43 = Question(
            43, "What is the name of this state?",
            R.drawable.nv,
            "Nevada","Wyoming","Utah","California",
            1
        )

        questionsList.add(que43)

        //Q44
        val que44 = Question(
            44, "What is the name of this state?",
            R.drawable.nm,
            "Colorado","Utah","New Mexico","Arizona",
            3
        )

        questionsList.add(que44)

        //Q45
        val que45 = Question(
            45, "What is the name of this state?",
            R.drawable.nj,
            "Maryland","Vermont","New Jersey","Pennsylvania",
            3
        )

        questionsList.add(que45)

        //Q46
        val que46 = Question(
            46, "What is the name of this state?",
            R.drawable.nh,
            "Maine","New Hampshire","New York","New Jersey",
            2
        )

        questionsList.add(que46)

        //Q47
        val que47 = Question(
            47, "What is the name of this state?",
            R.drawable.ne,
            "Wyoming","Kansas","South Dakota","Nebraska",
            4
        )

        questionsList.add(que47)

        //Q48
        val que48 = Question(
            48, "What is the name of this state?",
            R.drawable.nd,
            "Nevada","North Dakota","South Dakota","Wyoming",
            2
        )

        questionsList.add(que48)

        //Q49
        val que49 = Question(
            49, "What is the name of this state?",
            R.drawable.nc,
            "Virginia","North Carolina","North Dakota","South Carolina",
            2
        )

        questionsList.add(que49)

        //Q50
        val que50 = Question(
            50, "What is the name of this state?",
            R.drawable.mt,
            "Montana","Oregon","Idaho","Wyoming",
            1
        )

        questionsList.add(que50)

        return questionsList
    }
}