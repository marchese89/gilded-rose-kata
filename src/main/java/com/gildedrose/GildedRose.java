package com.gildedrose;

class GildedRose {
    Item[] items;
    private String agedBrie = "Aged Brie";
    private String backstage = "Backstage passes to a TAFKAL80ETC concert";
    private String sulfuras = "Sulfuras, Hand of Ragnaros";
    private String conjurados = "Conjured Mana Cake";

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (notAgedBrieAndNotBackstage(items[i].name)) {
                updateQualityGreaterZeroNotSulfuras(i);
            } else {
                updateQualityAgedBrieOrBackstage(i);
            }

            if (!isSulfuras(items[i].name)) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                updateQualitySellInLessThanZero(i);
            }
        }
    }

    private void updateQualityAgedBrieOrBackstage(int i) {
        if (items[i].quality < 50) {
            items[i].quality = items[i].quality + 1;
            if (isBackstage(items[i].name)) {
                updateQualityBackstage(i);
            }
        }
    }

    private void updateQualitySellInLessThanZero(int i) {
        if (!isAagedBrie(items[i].name)) {
            if (!isBackstage(items[i].name)) {
                updateQualityGreaterZeroNotSulfuras(i);
            } else {
                items[i].quality = 0;
            }
        } else {
            if (items[i].quality < 50) {
                items[i].quality = items[i].quality + 1;
            }
        }
    }

    private void updateQualityGreaterZeroNotSulfuras(int i) {
        if (isQualityGreaterThanZeroAndNotSulfuras(i)) {
                items[i].quality = items[i].quality - 1;
        }

        if(isConjurados(items[i].name)){
            items[i].quality = items[i].quality - 1;
        }
    }

    private boolean isQualityGreaterThanZeroAndNotSulfuras(int i) {
        return items[i].quality > 0 && !isSulfuras(items[i].name);
    }

    private void updateQualityBackstage(int i) {
        if (items[i].sellIn < 11) {
            items[i].quality = items[i].quality + 1;
        }

        if (items[i].sellIn < 6) {
            items[i].quality = items[i].quality + 1;
        }
    }

    private boolean isAagedBrie(String s){
        return agedBrie.equals(s);
    }

    private boolean isBackstage(String s){
        return backstage.equals(s);
    }

    private boolean isSulfuras(String s){
        return sulfuras.equals(s);
    }

    private boolean isConjurados(String s){
        return conjurados.equals(s);
    }

    private boolean notAgedBrieAndNotBackstage(String s){
        return !isAagedBrie(s) && !isBackstage(s);
    }
}
