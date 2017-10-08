/**
 * 
 */
package com.app.json.optimizer;

/**
 * @author yesu
 *
 */
public interface JsonOptimizer {

	public <T> String optimizeJson(T object) throws Exception;
}
