package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSet extends js.Object {
  def get(name: String): Color
}

object ColorSet {
  @scala.inline
  def apply(get: String => Color): ColorSet = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[ColorSet]
  }
}

