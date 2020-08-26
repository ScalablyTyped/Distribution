package typings.zipcelx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZipCelXConfig extends js.Object {
  /**
    * The file name of the exported file
    */
  var filename: String = js.native
  /**
    * The sheet to be exported as an .xlsx file
    */
  var sheet: ZipCelXSheet = js.native
}

object ZipCelXConfig {
  @scala.inline
  def apply(filename: String, sheet: ZipCelXSheet): ZipCelXConfig = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipCelXConfig]
  }
  @scala.inline
  implicit class ZipCelXConfigOps[Self <: ZipCelXConfig] (val x: Self) extends AnyVal {
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setSheet(value: ZipCelXSheet): Self = this.set("sheet", value.asInstanceOf[js.Any])
  }
  
}

