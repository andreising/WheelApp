package com.andreisingeleytsev.wheelapp.ui.screens.wheel_screen

sealed class ListOfQuestions{
    object Angle45: ListOfQuestions() {
        val array = arrayOf(
            QuestionItem(
                "What was the score in the Euro 2012 final?",
                listOf(
                    "4–0", "2–0", "3–0", "5–0"
                )
            ),
            QuestionItem(
                "Who won the Man of the Match award in the 2014 World Cup final?",
                listOf(
                    "Mario Goetze", "Sergio Aguero", "Lionel Messi", "Bastian Schweinsteiger"
                )
            ),
            QuestionItem(
                "Against which country did Wayne Rooney break the England goalscoring record?",
                listOf(
                    "Switzerland", "San Marino", "Lithuania", "Slovenia"
                )
            ),
            QuestionItem(
                "After losing a key player in the first game, which team went onto the semi-finals of Euro 2020?",
                listOf(
                    "Denmark", "Spain", "Wales", "England"
                )
            )
        )
    }
    object Angle90: ListOfQuestions() {
        val array = arrayOf(
            QuestionItem(
                "Which team won the NBA Finals in 2021?",
                listOf(
                    "Milwaukee Bucks", "Phoenix Suns", "Los Angeles Lakers", "Brooklyn Nets"
                )
            ),
            QuestionItem(
                "Which player won the NBA Finals MVP award in 2021?",
                listOf(
                    "Giannis Antetokounmpo", "Chris Paul", "LeBron James", "Devin Booker"
                )
            ),
            QuestionItem(
                "Who holds the record for the most points scored in an NBA game?",
                listOf(
                    "Wilt Chamberlain", "Kobe Bryant", "Michael Jordan", "LeBron James"
                )
            ),
            QuestionItem(
                "Which team holds the record for the most NBA championships?",
                listOf(
                    "Boston Celtics", "Los Angeles Lakers", "Chicago Bulls", "Golden State Warriors"
                )
            ),
            QuestionItem(
                "Who is the all-time leading scorer in NBA history?",
                listOf(
                    "Kareem Abdul-Jabbar", "Kobe Bryant", "LeBron James", "Michael Jordan"
                )
            )
        )
    }
    object Angle135: ListOfQuestions() {
        val array = arrayOf(
            QuestionItem(
                "Which team won the Stanley Cup in 2021?",
                listOf(
                    "Tampa Bay Lightning", "Montreal Canadiens", "New York Islanders", "Vegas Golden Knights"
                )
            ),
            QuestionItem(
                "Who holds the NHL record for the most career goals?",
                listOf(
                    "Wayne Gretzky", "Mario Lemieux", "Jaromir Jagr", "Brett Hull"
                )
            ),
            QuestionItem(
                "Which team holds the record for the longest winning streak in NHL history?",
                listOf(
                    "Pittsburgh Penguins", "Montreal Canadiens", "Chicago Blackhawks", "Boston Bruins"
                )
            ),
            QuestionItem(
                "Who won the Hart Trophy for the NHL's Most Valuable Player in the 2020-21 season?",
                listOf(
                    "Connor McDavid", "Leon Draisaitl", "Nathan MacKinnon", "Sidney Crosby"
                )
            ),
            QuestionItem(
                "Which team holds the record for the most consecutive Stanley Cup championships?",
                listOf(
                    "Montreal Canadiens", "Toronto Maple Leafs", "Detroit Red Wings", "New York Islanders"
                )
            ),
        )
    }
    object Angle180: ListOfQuestions() {
        val array = arrayOf(
            QuestionItem(
                "Who won the men's volleyball gold medal at the 2021 Olympics?",
                listOf(
                    "Brazil", "Italy", "Argentina", "Poland"
                )
            ),
            QuestionItem(
                "Who is the all-time leading scorer in men's FIVB Volleyball World Championship history?",
                listOf(
                    "Ivan Zaytsev", "György Grozer", "Goran Vujevic", "Yasser Abdelrahman"
                )
            )
        )
    }
    object Angle225: ListOfQuestions() {
        val array = arrayOf(
            QuestionItem(
                "Who is the current UFC lightweight champion?",
                listOf(
                    "Charles Oliveira", "Khabib Nurmagomedov", "Conor McGregor", "Dustin Poirier"
                )
            ),
            QuestionItem(
                "Which martial art is known as the 'gentle way'?",
                listOf(
                    "Judo", "Karate", "Tae Kwon Do", "Muay Thai"
                )
            ),
            QuestionItem(
                "Who was the first UFC women's bantamweight champion?",
                listOf(
                    "Ronda Rousey", "Holly Holm", "Amanda Nunes", "Miesha Tate"
                )
            )
        )
    }
    object Angle270: ListOfQuestions() {
        val array = arrayOf(
            QuestionItem(
                "Who won the men's singles title at the 2021 Wimbledon Championships?",
                listOf(
                    "Novak Djokovic", "Roger Federer", "Rafael Nadal", "Stefanos Tsitsipas"
                )
            ),
            QuestionItem(
                "Who won the women's singles title at the 2021 Australian Open?",
                listOf(
                    "Naomi Osaka", "Serena Williams", "Simona Halep", "Jennifer Brady"
                )
            ),
            QuestionItem(
                "Which player has won the most WTA singles titles in history?",
                listOf(
                    "Martina Navratilova", "Serena Williams", "Steffi Graf", "Chris Evert"
                )
            ),
            QuestionItem(
                "Who won the men's singles gold medal at the 2021 Olympics?",
                listOf(
                    "Alexander Zverev", "Novak Djokovic", "Daniil Medvedev", "Stefanos Tsitsipas"
                )
            )
        )
    }
    object Angle315: ListOfQuestions() {
        val array = arrayOf(
            QuestionItem(
                "Who is the current top scorer in the UEFA Champions League?",
                listOf(
                    "Cristiano Ronaldo", "Alan Shearer", "Thierry Henry", "Robert Lewandowski"
                )),
            QuestionItem(
                "What is the name of the handball move where a player jumps, shoots or passes the ball before landing with one foot and then landing with the other?",
                listOf(
                    "The jump shot", "The pivot", "The spin shot", "The lob"
                )
            ),
            QuestionItem(
                "Which cyclist won the 2021 Tour de France?",
                listOf(
                    "Tadej Pogacar", "Primoz Roglic", "Richard Carapaz", "Wout van Aert"
                )
            ),

            QuestionItem(
                "What is the name of the race that is considered to be the oldest one-day cycling event in the world?",
                listOf(
                    "Paris-Roubaix", "Tour of Flanders", "Milan-San Remo", "Liege-Bastogne-Liege"
                )
            ))
    }
    object Angle360: ListOfQuestions() {
        val array = arrayOf(
            QuestionItem(
                "Which country has won the most medals in Olympic track cycling?",
                listOf(
                    "Great Britain", "France", "Germany", "Netherlands"
                )
            ),

            QuestionItem(
                "What is the name of the cycling race that covers the entire circumference of the Earth's equator?",
                listOf(
                    "The Global Bicycle Race", "Around the World by Bicycle", "The Long Ride Home", "The Great Cycle Challenge"
                )
            ),

            QuestionItem(
                "Which cyclist won the most stages in the 2021 Giro d'Italia?",
                listOf(
                    "Peter Sagan", "Egan Bernal", "Simon Yates", "Caleb Ewan"
                )
            )
        )
    }
}
