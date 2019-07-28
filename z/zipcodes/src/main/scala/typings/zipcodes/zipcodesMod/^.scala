package typings.zipcodes.zipcodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipcodes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def distance(zipA: String, zipB: String): Double | Null = js.native
  def distance(zipA: String, zipB: Double): Double | Null = js.native
  def distance(zipA: Double, zipB: String): Double | Null = js.native
  def distance(zipA: Double, zipB: Double): Double | Null = js.native
  def lookup(zip: String): js.UndefOr[ZipCode] = js.native
  def lookup(zip: Double): js.UndefOr[ZipCode] = js.native
  def lookupByCoords(lat: Double, lon: Double): String | Null = js.native
  def lookupByName(city: String, state: String): js.Array[ZipCode] = js.native
  def lookupByState(state: String): js.Array[ZipCode] = js.native
  def radius(zip: String, miles: Double, full: Boolean): js.Array[String | ZipCode] = js.native
  def radius(zip: Double, miles: Double, full: Boolean): js.Array[String | ZipCode] = js.native
  def toKilometers(miles: Double): Double = js.native
  def toMiles(kilos: Double): Double = js.native
}

