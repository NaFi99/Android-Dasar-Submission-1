package com.example.myproject

//Memasukkan data
object Marvel {
    private val marvelMovies = arrayOf("Iron Man 1",
        "Iron Man 2",
        "Iron Man 3",
        "Captain America: The First Avenger",
        "Captain America: The Winter Soldier",
        "Captain America: Civil War",
        "Thor",
        "The Avengers",
        "Avengers: Age of Ultron",
        "Avengers: Infinity War")

    private val marvelRelease = arrayOf("April, 2008",
            "April, 2010",
            "April, 2013",
            "July, 2011",
            "March 2014",
            "April, 2016",
            "November, 2011",
            "May, 2012",
            "April, 2015",
            "May, 2018")

    private val marvelDirector = arrayOf("Jon Favreau",
            "Jon Favreau",
            "Shane Black",
            "Joe Johnston",
            "Joe Russo and Anthony Russo",
            "Joe Russo and Anthony Russo",
            "Kenneth Branagh",
            "Joss Whedon",
            "Joss Whedon",
            "Joe Russo and Anthony Russo")
    private val marvelCast = arrayOf("Robert Downey, Jr. , Jon Favreau , Gwyneth Paltrow , Stan Lee , Paul Bettany , Terrence Howard , Jeff Bridges , Clark Gregg",
        "Robert Downey, Jr. , Jon Favreau , Gwyneth Paltrow , Stan Lee , Paul Bettany , Don Cheadle , Scarlett Johansson , Samuel L. Jackson , Clark Gregg , Elon Musk , Mickey Rourke",
        "Robert Downey, Jr. , Jon Favreau , Gwyneth Paltrow , Stan Lee , Paul Bettany , Don Cheadle , Clark Gregg , Guy Pearce",
        "Robert Downey, Jr , Jon Favreau , Gwyneth Paltrow , Stan Lee , Paul Bettany , Don Cheadle , Scarlett Johansson , Samuel L. Jackson , Clark Gregg",
        "Chris Evans , Sebastian Stan , Stan Lee , Anthony Mackie , Emily VanCamp , Scarlett Johansson , Samuel L. Jackson",
        "Chris Evans , Sebastian Stan , Stan Lee , Anthony Mackie , Emily VanCamp , Scarlett Johansson , Samuel L. Jackson , Frank Grillo",
        " Chris Evans , Robert Downey, Jr. , Elizabeth Olsen , Paul Rudd , Paul Bettany , Chadwick Boseman , Jeremy Renner , Don Cheadle , Tom Holland , Sebastian Stan , Stan Lee , Anthony Mackie , Emily VanCamp , Scarlett Johansson , Samuel L. Jackson , Frank Grillo , Daniel Bruhl",
        "Chris Hemsworth, Tom Hiddleston , Tessa Thompson , Mark Rufallo , Idris Elba , Anthony Hopkins , Taika Watiti , Kat Dennings , Natalie Portman",
        "Chris Evans , Robert Downey, Jr. , Chris Hemsworth , Jeremy Renner , Scarlett Johansson , Samuel L. Jackson , Chris Hemsworth , Tom Hiddleston , Mark Rufallo , Paul Rudd , Paul Bettany",
        "Chris Evans , Robert Downey, Jr. , Chris Hemsworth , Jeremy Renner , Scarlett Johansson , Samuel L. Jackson , Chris Hemsworth , Tom Hiddleston , Mark Rufallo , Paul Bettany , Elizabeth Olsen , Aaron Taylor Johnson , Stan Lee , Anthony Mackie , James Spader",
        "Chris Evans Robert Downey, Jr. , Chris Hemsworth , Jeremy Renner , Scarlett Johansson , Samuel L. Jackson , Chris Hemsworth , Tom Hiddleston , Mark Rufallo , Paul Rudd , Paul Bettany , Elizabeth Olsen , Anthony Mackie , Tessa Thompson , Tom Holland , Sebastian Stan , Brie Larson , Karen Gillan , Chadwick Boseman , Benedict Cumberbatch , Chris Patt , Bradley Cooper , Zoe Saldana , Evangeline Lilly , Vin Diesel , Gwyneth Paltrow , Benedict Wong , Dave Bautista , Tessa Thompson"
        )
    private val marvelSynopsis = arrayOf("A billionaire industrialist and genius inventor, Tony Stark (Robert Downey Jr.), is conducting weapons tests overseas, but terrorists kidnap him to force him to build a devastating weapon. Instead, he builds an armored suit and upends his captors. Returning to America, Stark refines the suit and uses it to combat crime and terrorism.",
        "With the world now aware that he is Iron Man, billionaire inventor Tony Stark (Robert Downey Jr.) faces pressure from all sides to share his technology with the military. He is reluctant to divulge the secrets of his armored suit, fearing the information will fall into the wrong hands. With Pepper Potts (Gwyneth Paltrow) and Rhodey Rhodes (Don Cheadle) by his side, Tony must forge new alliances and confront a powerful new enemy.",
        "Plagued with worry and insomnia since saving New York from destruction, Tony Stark (Robert Downey Jr.), now, is more dependent on the suits that give him his Iron Man persona. So much so that every aspect of his life is affected, including his relationship with Pepper (Gwyneth Paltrow). After a malevolent enemy known as the Mandarin (Ben Kingsley) reduces his personal world to rubble, Tony must rely solely on instinct and ingenuity to avenge his losses and protect the people he loves.",
        "It is 1941 and the world is in the throes of war. Steve Rogers (Chris Evans) wants to do his part and join America's armed forces, but the military rejects him because of his small stature. Finally, Steve gets his chance when he is accepted into an experimental program that turns him into a supersoldier called Captain America. Joining forces with Bucky Barnes (Sebastian Stan) and Peggy Carter (Hayley Atwell), Captain America leads the fight against the Nazi-backed HYDRA organization.",
        "After the cataclysmic events in New York with his fellow Avengers, Steve Rogers, aka Captain America (Chris Evans), lives in the nation's capital as he tries to adjust to modern times. An attack on a S.H.I.E.L.D. colleague throws Rogers into a web of intrigue that places the whole world at risk. Joining forces with the Black Widow (Scarlett Johansson) and a new ally, the Falcon, Rogers struggles to expose an ever-widening conspiracy, but he and his team soon come up against an unexpected enemy",
        "Political pressure mounts to install a system of accountability when the actions of the Avengers lead to collateral damage. The new status quo deeply divides members of the team. Captain America (Chris Evans) believes superheroes should remain free to defend humanity without government interference. Iron Man (Robert Downey Jr.) sharply disagrees and supports oversight. As the debate escalates into an all-out feud, Black Widow (Scarlett Johansson) and Hawkeye (Jeremy Renner) must pick a side.",
        "As the son of Odin (Anthony Hopkins), king of the Norse gods, Thor (Chris Hemsworth) will soon inherit the throne of Asgard from his aging father. However, on the day that he is to be crowned, Thor reacts with brutality when the god's enemies, the Frost Giants, enter the palace in violation of their treaty. As punishment, Odin banishes Thor to Earth. While Loki (Tom Hiddleston), Thor's brother, plots mischief in Asgard, Thor, now stripped of his powers, faces his greatest threat.",
        "When Thor's evil brother, Loki (Tom Hiddleston), gains access to the unlimited power of the energy cube called the Tesseract, Nick Fury (Samuel L. Jackson), director of S.H.I.E.L.D., initiates a superhero recruitment effort to defeat the unprecedented threat to Earth. Joining Fury's dream team are Iron Man (Robert Downey Jr.), Captain America (Chris Evans), the Hulk (Mark Ruffalo), Thor (Chris Hemsworth), the Black Widow (Scarlett Johansson) and Hawkeye (Jeremy Renner).",
        "When Tony Stark (Robert Downey Jr.) jump-starts a dormant peacekeeping program, things go terribly awry, forcing him, Thor (Chris Hemsworth), the Incredible Hulk (Mark Ruffalo) and the rest of the Avengers to reassemble. As the fate of Earth hangs in the balance, the team is put to the ultimate test as they battle Ultron, a technological terror hell-bent on human extinction. Along the way, they encounter two mysterious and powerful newcomers, Pietro and Wanda Maximoff.",
        "Iron Man, Thor, the Hulk and the rest of the Avengers unite to battle their most powerful enemy yet, the evil Thanos. On a mission to collect all six Infinity Stones, Thanos plans to use the artifacts to inflict his twisted will on reality. The fate of the planet and existence itself has never been more uncertain as everything the Avengers have fought for has led up to this moment."
        )

    private val marvelImage = intArrayOf(
        R.drawable.iron_man_1,
        R.drawable.iron_man_2,
        R.drawable.iron_man_3,
        R.drawable.captain_america_1,
        R.drawable.captain_america_2,
        R.drawable.captain_america_3,
        R.drawable.thor,
        R.drawable.avenger_1,
        R.drawable.avenger_2,
        R.drawable.avenger_3,
    R.drawable.infinitywar)

    val listData: ArrayList<MCU>
    get(){
        val list = arrayListOf<MCU>()
        for (position in marvelMovies.indices){
            val movie = MCU()
            movie.title = marvelMovies[position]
            movie.director = marvelDirector[position]
            movie.release = marvelRelease[position]
            movie.synopsis = marvelSynopsis[position]
            movie.cast = marvelCast[position]
            movie.photo = marvelImage[position]

            list.add(movie)
        }
        return list
    }
}