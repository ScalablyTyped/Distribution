package typings.zipcelx.mod

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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ZipCelXSheet]
  }
}

