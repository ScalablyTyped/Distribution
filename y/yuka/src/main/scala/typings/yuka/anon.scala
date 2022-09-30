package typings.yuka

import typings.yuka.gameEntityMod.GameEntity
import typings.yuka.matrix3Mod.Matrix3
import typings.yuka.memoryRecordMod.MemoryRecord
import typings.yuka.yukaInts.`0`
import typings.yuka.yukaInts.`1`
import typings.yuka.yukaInts.`2`
import typings.yuka.yukaInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Diagonal extends StObject {
    
    var diagonal: Matrix3
    
    var unitary: Matrix3
  }
  object Diagonal {
    
    inline def apply(diagonal: Matrix3, unitary: Matrix3): Diagonal = {
      val __obj = js.Dynamic.literal(diagonal = diagonal.asInstanceOf[js.Any], unitary = unitary.asInstanceOf[js.Any])
      __obj.asInstanceOf[Diagonal]
    }
    
    extension [Self <: Diagonal](x: Self) {
      
      inline def setDiagonal(value: Matrix3): Self = StObject.set(x, "diagonal", value.asInstanceOf[js.Any])
      
      inline def setUnitary(value: Matrix3): Self = StObject.set(x, "unitary", value.asInstanceOf[js.Any])
    }
  }
  
  trait ERROR extends StObject {
    
    var ERROR: `2`
    
    var LOG: `0`
    
    var SILENT: `3`
    
    var WARN: `1`
  }
  object ERROR {
    
    inline def apply(): ERROR = {
      val __obj = js.Dynamic.literal(ERROR = 2, LOG = 0, SILENT = 3, WARN = 1)
      __obj.asInstanceOf[ERROR]
    }
    
    extension [Self <: ERROR](x: Self) {
      
      inline def setERROR(value: `2`): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setLOG(value: `0`): Self = StObject.set(x, "LOG", value.asInstanceOf[js.Any])
      
      inline def setSILENT(value: `3`): Self = StObject.set(x, "SILENT", value.asInstanceOf[js.Any])
      
      inline def setWARN(value: `1`): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetRecord extends StObject {
    
    def getRecord(entity: GameEntity): MemoryRecord
  }
  object GetRecord {
    
    inline def apply(getRecord: GameEntity => MemoryRecord): GetRecord = {
      val __obj = js.Dynamic.literal(getRecord = js.Any.fromFunction1(getRecord))
      __obj.asInstanceOf[GetRecord]
    }
    
    extension [Self <: GetRecord](x: Self) {
      
      inline def setGetRecord(value: GameEntity => MemoryRecord): Self = StObject.set(x, "getRecord", js.Any.fromFunction1(value))
    }
  }
  
  trait Timeout extends StObject {
    
    var timeout: Double
  }
  object Timeout {
    
    inline def apply(timeout: Double): Timeout = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timeout]
    }
    
    extension [Self <: Timeout](x: Self) {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
    
    var z: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double, z: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}
