/*
 * Copyright 2014 Click Travel Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package com.clicktravel.cheddar.infrastructure.persistence.database.exception;


/**
 * Exception to be used by the persistence layer to state that the request for an item with the specified id does not
 * existent in the persistence store.
 * 
 * 
 */

public class NonExistentItemException extends PersistenceException {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new NonExistentItemException with the given message
     * @param message The descriptive message used when reporting this Exception
     */
    public NonExistentItemException(final String message) {
        super(message);
    }

}
