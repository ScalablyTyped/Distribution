package typings
package zipcelxLib.zipcelxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZipCelXSheet extends js.Object {
  /**
    * The sheet's DataSet
    */
  var data: ZipCelXDataSet
}

object ZipCelXSheet {
  @scala.inline
  def apply(data: ZipCelXDataSet): ZipCelXSheet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ZipCelXSheet]
  }
}

