package typings.zipcelx.mod

import typings.zipcelx.zipcelxStrings.number
import typings.zipcelx.zipcelxStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZipCelXCell extends js.Object {
  /**
    * The cell value type
    */
  var `type`: string | number = js.native
  /**
    * The cell value
    */
  var value: String | Double = js.native
}

object ZipCelXCell {
  @scala.inline
  def apply(`type`: string | number, value: String | Double): ZipCelXCell = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipCelXCell]
  }
  @scala.inline
  implicit class ZipCelXCellOps[Self <: ZipCelXCell] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: string | number): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

