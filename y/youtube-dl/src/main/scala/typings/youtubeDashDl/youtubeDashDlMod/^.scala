package typings.youtubeDashDl.youtubeDashDlMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("youtube-dl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(url: String, arg: js.Array[String], opt: StringDictionary[String]): Youtubedl = js.native
  def exec(
    url: String,
    args: js.Array[String],
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]
  ): Unit = js.native
  def getExtractors(callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]): Unit = js.native
  def getExtractors(
    descriptions: Boolean,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]
  ): Unit = js.native
  def getExtractors(
    descriptions: Boolean,
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]
  ): Unit = js.native
  def getInfo(
    url: String,
    args: js.Array[String],
    callback: js.Function2[/* err */ js.Any, /* output */ Info, Unit]
  ): Unit = js.native
  def getInfo(
    url: String,
    args: js.Array[String],
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ Info, Unit]
  ): Unit = js.native
  def getInfo(url: String, callback: js.Function2[/* err */ js.Any, /* output */ Info, Unit]): Unit = js.native
  def getSubs(url: String, callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]): Unit = js.native
  def getSubs(
    url: String,
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]
  ): Unit = js.native
  def getThumbs(url: String, callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]): Unit = js.native
  def getThumbs(
    url: String,
    options: Options,
    callback: js.Function2[/* err */ js.Any, /* output */ js.Array[String], Unit]
  ): Unit = js.native
}

