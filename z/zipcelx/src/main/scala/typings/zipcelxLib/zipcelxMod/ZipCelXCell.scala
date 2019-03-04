package typings
package zipcelxLib.zipcelxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZipCelXCell extends js.Object {
  /**
    * The cell value type
    */
  var `type`: zipcelxLib.zipcelxLibStrings.string | zipcelxLib.zipcelxLibStrings.number
  /**
    * The cell value
    */
  var value: java.lang.String | scala.Double
}

object ZipCelXCell {
  @scala.inline
  def apply(
    `type`: zipcelxLib.zipcelxLibStrings.string | zipcelxLib.zipcelxLibStrings.number,
    value: java.lang.String | scala.Double
  ): ZipCelXCell = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipCelXCell]
  }
}

