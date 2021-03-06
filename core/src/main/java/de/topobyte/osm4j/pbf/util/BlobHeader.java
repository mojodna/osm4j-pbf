// Copyright 2015 Sebastian Kuerten
//
// This file is part of osm4j.
//
// osm4j is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// osm4j is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with osm4j. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.osm4j.pbf.util;

import com.google.protobuf.ByteString;

public class BlobHeader
{

	private String type;
	private int dataLength;
	private ByteString indexData;

	public BlobHeader(String type, int dataLength, ByteString indexData)
	{
		this.type = type;
		this.dataLength = dataLength;
		this.indexData = indexData;
	}

	public String getType()
	{
		return type;
	}

	public int getDataLength()
	{
		return dataLength;
	}

	public ByteString getIndexData()
	{
		return indexData;
	}

}
