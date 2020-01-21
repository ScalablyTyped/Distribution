package typings.zapierPlatformCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCursor extends js.Object {
  def get(): js.Promise[String]
  def set(cursor: String): js.Promise[Null]
}

object AnonCursor {
  @scala.inline
  def apply(get: () => js.Promise[String], set: String => js.Promise[Null]): AnonCursor = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[AnonCursor]
  }
}

