package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberSchema
  extends Schema[scala.Double] {
  def integer(): NumberSchema = js.native
  def integer(message: TestOptionsMessage): NumberSchema = js.native
  def lessThan(limit: scala.Double): NumberSchema = js.native
  def lessThan(limit: scala.Double, message: TestOptionsMessage): NumberSchema = js.native
  def lessThan(limit: Ref): NumberSchema = js.native
  def lessThan(limit: Ref, message: TestOptionsMessage): NumberSchema = js.native
  def max(limit: scala.Double): NumberSchema = js.native
  def max(limit: scala.Double, message: TestOptionsMessage): NumberSchema = js.native
  def max(limit: Ref): NumberSchema = js.native
  def max(limit: Ref, message: TestOptionsMessage): NumberSchema = js.native
  def min(limit: scala.Double): NumberSchema = js.native
  def min(limit: scala.Double, message: TestOptionsMessage): NumberSchema = js.native
  def min(limit: Ref): NumberSchema = js.native
  def min(limit: Ref, message: TestOptionsMessage): NumberSchema = js.native
  def moreThan(limit: scala.Double): NumberSchema = js.native
  def moreThan(limit: scala.Double, message: TestOptionsMessage): NumberSchema = js.native
  def moreThan(limit: Ref): NumberSchema = js.native
  def moreThan(limit: Ref, message: TestOptionsMessage): NumberSchema = js.native
  def negative(): NumberSchema = js.native
  def negative(message: TestOptionsMessage): NumberSchema = js.native
  def positive(): NumberSchema = js.native
  def positive(message: TestOptionsMessage): NumberSchema = js.native
  @JSName("round")
  def round_ceil(`type`: yupLib.yupLibStrings.ceil): NumberSchema = js.native
  @JSName("round")
  def round_floor(`type`: yupLib.yupLibStrings.floor): NumberSchema = js.native
  @JSName("round")
  def round_round(`type`: yupLib.yupLibStrings.round): NumberSchema = js.native
  @JSName("round")
  def round_trunc(`type`: yupLib.yupLibStrings.trunc): NumberSchema = js.native
  def truncate(): NumberSchema = js.native
}

