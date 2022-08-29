// This file is free software; you can redistribute it and/or modify it under
// the terms of the GNU General Public License version 2, 1991 as published by
// the Free Software Foundation.

// This program is distributed in the hope that it will be useful, but WITHOUT
// ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
// FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more
// details.

// A copy of the GNU General Public License can be found at:
// http://www.gnu.org/licenses/gpl.html

// a collection of item methods
import java.io.*;


public class Item2 {
    public static int runerock[] = {
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 1481, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451, 451,
        451, 451, 451, 451, 451, 451};

    public static int randomRuneRock() {
        return runerock[(int) (Math.random() * runerock.length)];
    }	

    public static int Silvchest[] = { 601, 758, 788, 983};

    public static int randomSilvchest() {
        return Silvchest[(int) (Math.random() * Silvchest.length)];
    }

    public static int fish[] = { 385, 385, 379, 379, 379, 379, 379};

    public static int randomFish() {
        return fish[(int) (Math.random() * fish.length)];
    }	
    public static int rat[] = {
        5698, 1305, 3105, 1725, 1704, 1323, 1153, 1115, 1067, 1081, 1157, 1119,
        1069, 1083};

    public static int randomrat() {
        return rat[(int) (Math.random() * rat.length)];
    }
    public static int soldier[] = {
        3101, 6897, 3202, 1333, 1319, 1113, 1127, 1147, 1093, 1079, 1373, 4131,
        995};

    public static int randomsoldier() {
        return soldier[(int) (Math.random() * soldier.length)];
    }
    public static int ogre[] = { 837, 5018, 995};

    public static int randomogre() {
        return ogre[(int) (Math.random() * ogre.length)];
    }
    public static int Wyvern[] = { 1055, 1046, 1048, 1057, 1044, 1038, 1040, 1053, 1042, 2581, 2577, 2581, 2577, 1187, 1187, 1187, 7462, 7462, 7462, 15349, 15348, 14139, 15156, 4214, 15351, 14140, 15195, 14137, 14086, 14113, 14080, 14095, 14131, 14089, 14083, 14110};

    public static int randomWyvern() {
        return Wyvern[(int) (Math.random() * Wyvern.length)];
    }
    public static int chicken[] = { 4834};

    public static int randomchicken() {
        return chicken[(int) (Math.random() * chicken.length)];
    }
    public static int skeleton[] = {
        6137, 6139, 6141, 995, 995};

    public static int randomskeleton() {
        return skeleton[(int) (Math.random() * skeleton.length)];
    }
    public static int crawlinghand[] = {
        2615, 1333, 526, 526};

    public static int randomcrawlinghand() {
        return crawlinghand[(int) (Math.random() * crawlinghand.length)];
    }
    public static int cavebug[] = {
        4119, 4121, 4123, 4125, 4127, 4129, 4131, 526, 526};

    public static int randomcavebug() {
        return cavebug[(int) (Math.random() * cavebug.length)];
    }
    public static int jelly[] = {
        3122, 6809, 526, 526, 14570, 14571, 14572, 995, 995};

    public static int randomjelly() {
        return jelly[(int) (Math.random() * jelly.length)];
    }
    public static int aberrantspecter[] = {
        3840, 3842, 3844};

    public static int randomaberrantspecter() {
        return aberrantspecter[(int) (Math.random() * aberrantspecter.length)];
    }
    public static int abyssaldemon[] = {
        4151, 526, 526, 14567, 14568, 14569, 4151, 4151, 526, 995, 995};

    public static int randomabyssaldemon() {
        return abyssaldemon[(int) (Math.random() * abyssaldemon.length)];
    }
    public static int darkbeast[] = {
        6818, 11192, 15185, 13591, 13592, 13594, 15311, 15310, 15309, 15086, 15156, 1188, 526, 995, 526, 526, 995};

    public static int randomdarkbeast() {
        return darkbeast[(int) (Math.random() * darkbeast.length)];
    }
    public static int barbarian[] = {
        1725, 1704, 1962, 3105, 1305, 5698, 4587, 4726, 7386, 7394, 7390, 995};

    public static int randombarbarian() {
        return barbarian[(int) (Math.random() * barbarian.length)];
    }
    public static int unicorn[] = {
        6966, 995, 995};

    public static int randomunicorn() {
        return unicorn[(int) (Math.random() * unicorn.length)];
    }
    public static int battlemagesara[] = {
        14507, 14508, 14513, 5698};

    public static int randombattlemagesara() {
        return battlemagesara[(int) (Math.random() * battlemagesara.length)];
    }
    public static int battlemagezammy[] = {
        14507, 14508, 14512, 5698};

    public static int randombattlemagezammy() {
        return battlemagezammy[(int) (Math.random() * battlemagezammy.length)];
    }
    public static int battlemageguthix[] = {
        14507, 14508, 14511, 5698};

    public static int randombattlemageguthix() {
        return battlemageguthix[(int) (Math.random() * battlemageguthix.length)];
    }
    public static int troll[] = {
        3741, 3741, 3741, 3741, 995, 995};

    public static int randomtroll() {
        return troll[(int) (Math.random() * troll.length)];
    }

    public static int well[] = {393, 4675, 15033, 1309, 377, 4151, 1044, 1050, 1155, 6570, 1161, 1123, 1199, 1331, 1073, 15352, 13601, 6585, 7462, 6139, 1961, 853, 6737, 6528, 6137, 6141, 14512, 14511, 1052, 391, 861, 4734, 1601, 2996, 15156};

    public static int randomwell()
    {
    	return well[(int)(Math.random()*well.length)];
    }

    public static int KQ[] = {
        2633, 2635, 2637, 2978, 2980, 2982, 2984, 2986, 2988, 2990, 2992, 2994,
        2957, 2653, 2655, 2659, 3478, 2665, 2661, 2663, 2667, 3479, 2673, 2669,
        2671, 3480, 4724, 4728, 4730, 4726, 6570, 1037, 1050, 6857, 6859, 6861,
        6863, 6856, 6858, 6860, 6862, 6818, 989};

    public static int randomKQ() {
        return KQ[(int) (Math.random() * KQ.length)];
    }
    public static int Ahrim[] = { 4708, 4710, 4712, 4714};
    public static int randomAhrim() {
        return Ahrim[(int) (Math.random() * Ahrim.length)];
    }

    public static int DAG1[] = { 14522, 14523, 14524, 14525, 14526, 14527, 14528, 14529, 14530, 14531, 14532, 14533, 14538, 14539, 14540, 14541, 14542, 14543, 14544, 14545, 14546, 14547, 14548, 14549, 14550, 14551, 14552, 14553, 14554, 14555, 14556, 14557, 6735, 6731, 6737, 6733, 6735, 6731, 6737, 6733, 6735, 6731, 6737, 6733, 6735, 6731, 6737, 6733};
    public static int randomDAG1() {
        return DAG1[(int) (Math.random() * DAG1.length)];
    }

    public static int DAG2[] = { 14522, 14523, 14524, 14525, 14526, 14527, 14528, 14529, 14530, 14531, 14532, 14533, 14538, 14539, 14540, 14541, 14542, 14543, 14544, 14545, 14546, 14547, 14548, 14549, 14550, 14551, 14552, 14553, 14554, 14555, 14556, 14557, 6735, 6731, 6737, 6733, 6735, 6731, 6737, 6733, 6735, 6731, 6737, 6733, 6735, 6731, 6737, 6733, 6735, 6731, 6737, 6733, 6735, 6731, 6737, 6733, 6735, 6731, 6737, 6733, 6735, 6731, 6737, 6733, 6735, 6731, 6737, 6733};
    public static int randomDAG2() {
        return DAG2[(int) (Math.random() * DAG2.length)];
    }

    public static int DAG3[] = { 14522, 14523, 14524, 14525, 14526, 14527, 14528, 14529, 14530, 14531, 14532, 14533, 14538, 14539, 14540, 14541, 14542, 14543, 14544, 14545, 14546, 14547, 14548, 14549, 14550, 14551, 14552, 14553, 14554, 14555, 14556, 14557, 6735, 6731, 6737, 6733, 6735, 6731, 6737, 6733, 6735, 6731, 6737, 6733, 6735, 6731, 6737, 6733, 6735, 6731, 6737, 6733, 6735, 6731, 6737, 6733, 6735, 6731, 6737, 6733, 6735, 6731, 6737, 6733, 6735, 6731, 6737, 6733, 6735, 6731};
    public static int randomDAG3() {
        return DAG3[(int) (Math.random() * DAG3.length)];
    }

    public static int Guthan[] = { 4724, 4726, 4728, 4730};
    public static int randomGuthan() {
        return Guthan[(int) (Math.random() * Guthan.length)];
    }

    public static int Karil[] = { 4732, 4734, 4736, 4738};
    public static int randomKaril() {
        return Karil[(int) (Math.random() * Karil.length)];
    }

    public static int Torag[] = { 4745, 4747, 4749, 4751};
    public static int randomTorag() {
        return Torag[(int) (Math.random() * Torag.length)];
    }

    public static int Verac[] = { 4753, 4755, 4757, 4759};
    public static int randomVerac() {
        return Verac[(int) (Math.random() * Verac.length)];
    }

    public static int InfernalMage[] = { 995, 995, 526, 4089, 4091, 4093, 4095, 4097, 4099, 4101, 4103, 4105, 4107, 4109, 4111, 4113, 4115, 4117};
    public static int randomInfernalMage() {
        return InfernalMage[(int) (Math.random() * InfernalMage.length)];
    }

    public static int Graardor[] = { 6918, 6916, 6924, 6585, 4214, 6528, 7158, 1149, 3140, 4087, 4585, 1187, 15352};
    public static int randomGraardor() {
        return Graardor[(int) (Math.random() * Graardor.length)];
    }

    public static int OGRE[] = { 13601, 13600, 13599, 13598, 13597, 13596, 13595, 7462, 4151, 7453, 7454, 7455, 7456, 7457, 7458, 7459, 7460, 7461};
    public static int randomOGRE() {
        return OGRE[(int) (Math.random() * OGRE.length)];
    }
    public static int Dharok[] = { 4716, 4718, 4720, 4722};
    public static int randomDharok() {
        return Dharok[(int) (Math.random() * Dharok.length)];
    }
}
