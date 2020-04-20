package typings.zapierPlatformCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGet extends js.Object {
  def get(): js.Promise[String]
  def set(cursor: String): js.Promise[Null]
}

object AnonGet {
  @scala.inline
  def apply(get: () => js.Promise[String], set: String => js.Promise[Null]): AnonGet = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[AnonGet]
  }
}

