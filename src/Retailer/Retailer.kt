package Retailer

interface Retailer<out T> {

    fun sell():T
}