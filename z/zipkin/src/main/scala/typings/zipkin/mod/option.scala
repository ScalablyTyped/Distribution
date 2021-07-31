package typings.zipkin.mod

import typings.zipkin.zipkinBooleans.`false`
import typings.zipkin.zipkinBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object option {
  
  @JSImport("zipkin", "option")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("zipkin", "option.None")
  @js.native
  val None: INone[scala.Nothing] = js.native
  
  @JSImport("zipkin", "option.Option")
  @js.native
  abstract class Option[T] () extends StObject {
    
    def equals(other: IOption[T]): Boolean = js.native
    
    def flatMap[V](fn: js.Function1[/* value */ T, IOption[V]]): IOption[V] = js.native
    
    def getOrElse(fnOrValue: T): T = js.native
    def getOrElse(fnOrValue: js.Function0[T]): T = js.native
    
    def ifPresent(fn: js.Function1[/* value */ T, js.Any]): Unit = js.native
    
    def map[V](fn: js.Function1[/* value */ T, V]): IOption[V] = js.native
  }
  
  @JSImport("zipkin", "option.Some")
  @js.native
  class Some[T] protected ()
    extends Option[T]
       with IOption[T] {
    def this(value: T) = this()
    
    val present: `true` = js.native
    
    val `type`: typings.zipkin.zipkinStrings.Some = js.native
  }
  
  // Throw error is not a valid option
  @scala.inline
  def fromNullable[V](nullable: V): IOption[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(nullable.asInstanceOf[js.Any]).asInstanceOf[IOption[V]]
  
  @scala.inline
  def isOptional(data: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptional")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def verifyIsOptional(data: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyIsOptional")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait INone[T]
    extends Option[T]
       with IOption[T] {
    
    val present: `false` = js.native
    
    val `type`: typings.zipkin.zipkinStrings.None = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.zipkin.mod.option.Some[T]
    - typings.zipkin.mod.option.INone[T]
  */
  trait IOption[T] extends StObject
}
