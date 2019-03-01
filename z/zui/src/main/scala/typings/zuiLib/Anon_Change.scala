package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Change extends js.Object {
  var change: java.lang.String
  var colIndex: scala.Double
  var newWidth: scala.Double
  var oldWidth: scala.Double
}

object Anon_Change {
  @scala.inline
  def apply(change: java.lang.String, colIndex: scala.Double, newWidth: scala.Double, oldWidth: scala.Double): Anon_Change = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("change")(change)
    __obj.updateDynamic("colIndex")(colIndex)
    __obj.updateDynamic("newWidth")(newWidth)
    __obj.updateDynamic("oldWidth")(oldWidth)
    __obj.asInstanceOf[Anon_Change]
  }
}

