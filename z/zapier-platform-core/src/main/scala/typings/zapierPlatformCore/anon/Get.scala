package typings.zapierPlatformCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Get extends js.Object {
  def get(): js.Promise[String]
  def set(cursor: String): js.Promise[Null]
}

object Get {
  @scala.inline
  def apply(get: () => js.Promise[String], set: String => js.Promise[Null]): Get = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Get]
  }
}

