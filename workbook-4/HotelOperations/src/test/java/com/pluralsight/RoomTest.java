package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    @Test
    public void testCheckInRoomNotOccupiedOrDirty() {
        // Arrange
        Room room = new Room(2, 100.0, false, false);

        // Act
        room.checkIn();

        // Assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void testCheckOutRoomOccupied() {
        // Arrange
        Room room = new Room(2, 100.0, true, true);

        // Act
        room.checkOut();

        // Assert
        assertFalse(room.isOccupied());
    }

    @Test
    public void testCleanRoomOccupiedAndDirty() {
        // Arrange
        Room room = new Room(2, 100.0, true, true);

        // Act
        room.cleanRoom();

        // Assert
        assertFalse(room.isDirty());
    }

    @Test
    public void testCheckInRoomAlreadyOccupied() {
        // Arrange
        Room room = new Room(2, 100.0, true, false);

        // Act
        boolean result = room.checkIn();

        // Assert
        assertFalse(result);
    }


    @Test
    public void testCheckInRoomDirty() {
        // Arrange
        Room room = new Room(2, 100.0, false, true);

        // Act & Assert
        assertFalse(room.checkIn());
    }

    @Test
    public void testCleanRoomNotOccupied() {
        // Arrange
        Room room = new Room(2, 100.0, false, true);

        // Act & Assert
        assertFalse(room.cleanRoom());
    }
}

