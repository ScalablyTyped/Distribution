package typings
package zipcodesLib.zipcodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipcodes", JSImport.Namespace)
@js.native
object zipcodesModMembers extends js.Object {
  def distance(zipA: java.lang.String, zipB: java.lang.String): scala.Double | scala.Null = js.native
  def distance(zipA: java.lang.String, zipB: scala.Double): scala.Double | scala.Null = js.native
  def distance(zipA: scala.Double, zipB: java.lang.String): scala.Double | scala.Null = js.native
  def distance(zipA: scala.Double, zipB: scala.Double): scala.Double | scala.Null = js.native
  def lookup(zip: java.lang.String): js.UndefOr[ZipCode] = js.native
  def lookup(zip: scala.Double): js.UndefOr[ZipCode] = js.native
  def lookupByCoords(lat: scala.Double, lon: scala.Double): java.lang.String | scala.Null = js.native
  def lookupByName(city: java.lang.String, state: java.lang.String): js.Array[ZipCode] = js.native
  def lookupByState(state: java.lang.String): js.Array[ZipCode] = js.native
  def radius(zip: java.lang.String, miles: scala.Double, full: scala.Boolean): js.Array[java.lang.String] | js.Array[ZipCode] = js.native
  def radius(zip: scala.Double, miles: scala.Double, full: scala.Boolean): js.Array[java.lang.String] | js.Array[ZipCode] = js.native
  def toKilometers(miles: scala.Double): scala.Double = js.native
  def toMiles(kilos: scala.Double): scala.Double = js.native
}

