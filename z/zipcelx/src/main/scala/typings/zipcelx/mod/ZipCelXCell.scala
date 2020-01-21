package typings.zipcelx.mod

import typings.zipcelx.zipcelxStrings.number
import typings.zipcelx.zipcelxStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZipCelXCell extends js.Object {
  /**
    * The cell value type
    */
  var `type`: string | number
  /**
    * The cell value
    */
  var value: String | Double
}

object ZipCelXCell {
  @scala.inline
  def apply(`type`: string | number, value: String | Double): ZipCelXCell = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipCelXCell]
  }
}

