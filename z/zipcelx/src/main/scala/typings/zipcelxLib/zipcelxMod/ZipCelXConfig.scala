package typings
package zipcelxLib.zipcelxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZipCelXConfig extends js.Object {
  /**
    * The file name of the exported file
    */
  var filename: java.lang.String
  /**
    * The sheet to be exported as an .xlsx file
    */
  var sheet: ZipCelXSheet
}

object ZipCelXConfig {
  @scala.inline
  def apply(filename: java.lang.String, sheet: ZipCelXSheet): ZipCelXConfig = {
    val __obj = js.Dynamic.literal(filename = filename, sheet = sheet)
  
    __obj.asInstanceOf[ZipCelXConfig]
  }
}

