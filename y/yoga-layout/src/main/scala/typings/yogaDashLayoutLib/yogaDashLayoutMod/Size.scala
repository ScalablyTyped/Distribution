package typings
package yogaDashLayoutLib.yogaDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  val height: scala.Double
  val width: scala.Double
  def fromJS(expose: js.Function2[/* width */ scala.Double, /* height */ scala.Double, _]): scala.Unit
}

object Size {
  @scala.inline
  def apply(
    fromJS: js.Function2[/* width */ scala.Double, /* height */ scala.Double, _] => scala.Unit,
    height: scala.Double,
    toString: () => java.lang.String,
    width: scala.Double
  ): Size = {
    val __obj = js.Dynamic.literal(fromJS = js.Any.fromFunction1(fromJS), height = height, toString = js.Any.fromFunction0(toString), width = width)
  
    __obj.asInstanceOf[Size]
  }
}

