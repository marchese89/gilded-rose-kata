package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class GildedRoseTest {



    @Test
    void agedBrieQualityTest(){
        Item[] items = new Item[] { new Item("Aged Brie", -2, 0) };
        GildedRose gr = new GildedRose(items);
        gr.updateQuality();
        assertEquals(2, gr.items[0].quality);
    }

    @Test
    void agedBrieSellInTest(){
        Item[] items = new Item[] { new Item("Aged Brie", -2, 0) };
        GildedRose gr = new GildedRose(items);
        gr.updateQuality();
        assertEquals(-3, gr.items[0].sellIn);
    }


    @Test
    void backstageQualityTest(){
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -2, 20) };
        GildedRose gr = new GildedRose(items);
        gr.updateQuality();
        assertEquals(0, gr.items[0].quality);
    }

    @Test
    void backstageSellInTest(){
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -2, 20) };
        GildedRose gr = new GildedRose(items);
        gr.updateQuality();
        assertEquals(-3, gr.items[0].sellIn);
    }

    @Test
    void conjuredManaQualityTest(){
        Item[] items = new Item[] { new Item("Conjured Mana Cake", -1, 6)  };
        GildedRose gr = new GildedRose(items);
        gr.updateQuality();
        assertEquals(2, gr.items[0].quality);
    }

    @Test
    void conjuredManaSellInTest(){
        Item[] items = new Item[] { new Item("Conjured Mana Cake", -1, 6)  };
        GildedRose gr = new GildedRose(items);
        gr.updateQuality();
        assertEquals(-2, gr.items[0].sellIn);
    }

//    @Test
//    void conjuradosQualityTest(){
//        Item[] items = new Item[] { new Item("conjurados", 12, 6)  };
//        GildedRose gr = new GildedRose(items);
//        gr.updateQuality();
//        assertEquals(4, gr.items[0].quality);
//    }
//
//    @Test
//    void conjuradosSellInTest(){
//        Item[] items = new Item[] { new Item("conjurados", 12, 6)  };
//        GildedRose gr = new GildedRose(items);
//        gr.updateQuality();
//        assertEquals(11, gr.items[0].sellIn);
//    }

}
