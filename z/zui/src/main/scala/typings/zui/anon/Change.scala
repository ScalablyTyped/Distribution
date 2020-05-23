package typings.zui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  var change: String
  var colIndex: Double
  var newWidth: Double
  var oldWidth: Double
}

object Change {
  @scala.inline
  def apply(change: String, colIndex: Double, newWidth: Double, oldWidth: Double): Change = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], colIndex = colIndex.asInstanceOf[js.Any], newWidth = newWidth.asInstanceOf[js.Any], oldWidth = oldWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
}

