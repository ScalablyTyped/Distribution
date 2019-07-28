package typings.zeroclipboard.ZCNs

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Basic collection types for shorthands and interoperation
trait List[T] extends /* index */ NumberDictionary[T] {
  var length: Double
}

object List {
  @scala.inline
  def apply[T](length: Double, NumberDictionary: /* index */ NumberDictionary[T] = null): List[T] = {
    val __obj = js.Dynamic.literal(length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[List[T]]
  }
}

