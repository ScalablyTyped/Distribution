package typings.yog2Kernel.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.nodeRal.mod.Config
import typings.nodeRal.mod.ConfigNormalizer
import typings.nodeRal.mod.RAL.RalRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRAL extends js.Object {
  
  def apply(serviceName: String): RalRunner = js.native
  def apply(serviceName: String, options: js.Object): RalRunner = js.native
  
  var NormalizerManager: Instantiable0[typings.nodeRal.mod.RAL.NormalizerManager] = js.native
  
  var RalRunner: Instantiable1[/* serviceName */ String, typings.nodeRal.mod.RAL.RalRunner] = js.native
  
  def appendExtPath(extPath: String): Unit = js.native
  
  def getConf(name: String): Config = js.native
  
  def getRawConf(name: String): Config = js.native
  
  def init(): Unit = js.native
  def init(options: js.Object): Unit = js.native
  
  def reload(): Unit = js.native
  def reload(options: js.Object): Unit = js.native
  
  def setConfigNormalizer(normalizers: ConfigNormalizer): Unit = js.native
}
